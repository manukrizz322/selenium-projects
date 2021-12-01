package Org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_SendKeysQ2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
	WebElement findElement = driver.findElement(By.id("src"));
	findElement.sendKeys("Chennai");
	
	
	WebElement findElement2 = driver.findElement(By.id("dest"));
	findElement2.sendKeys("thirvanthapuram");
		
		
		 
		
		
		
		
		
	}

}
