package Org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision_Project {

	public static void main(String[] args) throws IOException, AWTException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
Robot rob = new Robot();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("manukrizz322@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6238289310");
		driver.findElement(By.xpath("//span[text()[normalize-space()='Sign in']]")).click();
		
		for (int i = 1; i <=9; i++) {
			
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		}
		Thread.sleep(2000);
		TakesScreenshot shot =driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\screen\\scr.png");
		FileUtils.copyFile(src, des);
		
		
		

}
}