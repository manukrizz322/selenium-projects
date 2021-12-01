package Org.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath_Day4_Task1 {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\" + "Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();

		d.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement from = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("Chennai (All Locations)");
		from.click();

		WebElement to = d.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Trivandrum");
		to.click();

		WebElement calender = d.findElement(By.xpath("//input[@readonly='readonly']"));
		calender.click();

		for (int i = 1; i < 4; i++) {
			WebElement nextbutton = d.findElement(By.xpath("//td[@class='next']"));
			nextbutton.click();
		} // we have to clicked that button 4times using the looping statement

		for (int i = 1; i < 2; i++) {
			WebElement prevbutton = d.findElement(By.xpath("//td[@class='prev']"));
			prevbutton.click();
		}

		WebElement date = d.findElement(By.xpath("(//td[@class='wd day'])[15]"));
		date.click();

		WebElement button = d.findElement(By.xpath("//button[@id='search_btn']"));
		button.click();}}

	

