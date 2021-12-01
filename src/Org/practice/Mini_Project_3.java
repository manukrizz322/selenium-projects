package Org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_3 extends Property_Set {
	public static void main(String[] args) throws AWTException, InterruptedException {
		property();
		ChromeDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		Robot rob = new Robot();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select sc = new Select(driver.findElement(By.id("searchDropdownBox")));
		sc.selectByVisibleText("Electronics");

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		act.moveToElement(driver.findElement(By.xpath("//span[text()[normalize-space()='Mobiles & Accessories']]")))
				.build().perform();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		act.moveToElement(driver.findElement(By.linkText("Power Banks"))).click().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()[normalize-space()='Mobiles & Accessories']]"))).build().perform();
		Thread.sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].click();",driver.findElement(By.linkText("Power Banks")));

	}

}

