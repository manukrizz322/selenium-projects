package Org.task;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_5_Multiple_Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.ironspider.ca/forms/dropdowns.htm");

		Thread.sleep(1000);
		WebElement multi = d.findElement(By.xpath("//select[@name='coffee2']"));
		Select s = new Select(multi);
		

		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		s.deselectByValue("cream");// these option has already selected as in default ,so I'll deselect that option
		s.selectByValue("sugar");

		List<WebElement> options = s.getOptions();// they return of all options

		for (WebElement iterator : options) {

			String text = iterator.getText();
			System.out.println(text);
		}

		System.out.println("---------------------------------------------------------------------");
		Thread.sleep(1000);
		WebElement multi1 = d.findElement(By.xpath("//select[@name='coffee2']"));
		Select e = new Select(multi1);

		boolean multiple1 = e.isMultiple();
		System.out.println(multiple1);

		e.selectByValue("honey");
		e.selectByValue("donut");

		List<WebElement> options1 = s.getAllSelectedOptions();// they return only the selected values

		for (WebElement iterator1 : options1) {

			String text1 = iterator1.getText();
			System.out.println(text1);
		}}}
	

