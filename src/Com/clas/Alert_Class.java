package Com.clas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\"
				+ "eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
		WebElement button1 = d.findElement(By.xpath("//button[@id='alertButton']"));
		button1.click();
		
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		
		WebElement button2 = d.findElement(By.xpath("//button[@id='confirmButton']"));
		button2.click();
		
		Thread.sleep(2000);
		d.switchTo().alert().dismiss();
		
		WebElement button3 = d.findElement(By.xpath("//button[@id='promtButton']"));
		button3.click();
		
		Thread.sleep(2000);
		Alert alert = d.switchTo().alert();
		alert.sendKeys("running sussefully");
	      alert.accept();
	
		
		
		
		

	}

}
