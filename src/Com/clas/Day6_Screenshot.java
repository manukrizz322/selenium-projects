package Com.clas;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Day6_Screenshot {

	public static void main(String[] args) throws IOException, Throwable  {
		
		
		 
		WebDriver d = new ChromeDriver();
        d.get("https://www.facebook.com/");
        WebElement findElement = d.findElement(By.id("email"));
		findElement.sendKeys("manojkrizz322@gmail.com");
        WebElement input2 = d.findElement(By.name("pass"));
		input2.sendKeys("123343435");
        WebElement login = d.findElement(By.name("login"));
		login.click();
	
		

		Thread.sleep(2000);
		TakesScreenshot shot = (TakesScreenshot) d;// narrowing
		File source = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\screen\\snap.png");
		FileHandler.copy(source, des);
		
      	}}

	


