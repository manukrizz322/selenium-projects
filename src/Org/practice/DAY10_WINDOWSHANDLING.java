package Org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DAY10_WINDOWSHANDLING {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		Robot rob = new Robot();
		driver.get("http://www.greenstechnologys.com/oracle-training.html\r\n" + 
				"");
		act.moveToElement(driver.findElement(By.xpath("//button[@type='button']"))).click().build().perform();
		String text = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]")).getText();
		System.out.println(text);
		

		Thread.sleep(3000);
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("./screen/snap.png");
		FileHandler.copy(src, des);

	}

}
