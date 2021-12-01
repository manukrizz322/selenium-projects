package Org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace"
				+ "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='a-section _deals-shoveler-v2_style_dealInfo__1U5R1'])[3]"));
		
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='a-section _deals-shoveler-v2_style_dealInfo__1U5R1'])[1]"));
		
		
		
		Actions act =new Actions(driver);
		
		
		Thread.sleep(1000);
		act.moveToElement(element);
		act.contextClick().build().perform();
		
		Thread.sleep(1000);
		act.moveToElement(element1);
		act.click().build().perform();
		
		
		
		
		
		

		

	}

}
