package Com.clas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users" + "\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
        Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("_thenmzhi");

		driver.findElement(By.name("password")).sendKeys("Manukrizz@4052");

		driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}
}
