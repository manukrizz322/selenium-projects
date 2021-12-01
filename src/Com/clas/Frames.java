package Com.clas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");

		WebElement link = d.findElement(By.xpath("//a[contains(text(),'with')]"));
		link.click();
		int size = d.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		d.switchTo().frame(1);

		WebElement innerframe = d.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));

		d.switchTo().frame(innerframe);

		Thread.sleep(3000);
		WebElement findElement = d.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("tester");

	}

}
