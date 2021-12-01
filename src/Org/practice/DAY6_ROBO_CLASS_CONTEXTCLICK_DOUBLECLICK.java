package Org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DAY6_ROBO_CLASS_CONTEXTCLICK_DOUBLECLICK extends Property_Set {
	public static void main(String[] args) throws AWTException, Throwable {
		property();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		Actions act = new Actions(driver);
		Robot rob = new Robot();

		driver.findElement(By.linkText("Download Links click here")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java")).click();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_P);
		rob.keyRelease(KeyEvent.VK_P);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		}

	}


