package Org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testing_Day2 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manojkrishnan\\"
	 		+ "eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	 
	 WebDriver driver =new ChromeDriver();
	 driver.get("https:/www.dailymotion.com/signin");
	 
	 WebElement findElement = driver.findElement(By.name("email"));
	 findElement.sendKeys("manukrizz322@gmail.com");
	 
	 
	 WebElement findElement2 = driver.findElement(By.name("password"));
	 findElement2.sendKeys("123456");
	 
	 
	 WebElement findElement3 = driver.findElement(By.xpath("//button[@type='submit']"));
	 findElement3.click();
	 
	
	 
	 
	
	
	
	 

	}

}
