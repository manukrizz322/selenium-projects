package Org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Task {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
       d.get("https://www.irctc.co.in/nget/train-search");
       
      
       
     
       
       WebElement findElement = d.findElement(By.xpath("//button[text()='OK']"));
       findElement.click();
       
       Thread .sleep(1000);
       d.switchTo().alert().accept();
	}

}
