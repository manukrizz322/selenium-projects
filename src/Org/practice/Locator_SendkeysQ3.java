package Org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_SendkeysQ3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishna"
			+ "n\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.google.com/");
	
	WebElement findElement = d.findElement(By.name("q"));
	findElement.sendKeys("GreensTechnology");
	
	

	}

}
