package Org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_Project1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Robot rob = new Robot();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.name("keyword")).sendKeys("iphone7"+Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator(); 
		String next = iterator.next();
		String next2 = iterator.next();

		driver.switchTo().window(next2);

		//Set<String> windowHandles = driver.getWindowHandles();
		// List<String> windows = new Vector<>(windowHandles);
	// driver.switchTo().window(windows.get(1));

		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		String text = driver.findElement(By.xpath("//div[text()='You Pay: ']")).getText();
		System.out.println(text);

	}

}
