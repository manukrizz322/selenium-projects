package Org.task;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Aler_Frames {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		Robot rob = new Robot();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com//");
		
		WebElement contactus = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		act.contextClick(contactus).perform();
		
		for (int i = 1; i <= 2; i++) {
			Thread.sleep(1000);
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			if (i == 2) {
			Thread.sleep(1000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);}}
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles)	{
			Thread.sleep(1000);
			System.out.println(driver.switchTo().window(string).getTitle());
		}
				
		String s = "Greens Technology Address - Greens Technology Adyar | Greens Technology Velachery | Tambaram | Thoraipakkam OMR Address";
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(s)) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//a[text()='Courses '])[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//img[@alt='Oracle DBA Icon']")).click();}}
			
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\screen\\oracle course.png");
		FileUtils.copyFile(source, des);}}







		
			
			
		

		

		

		

		

	


