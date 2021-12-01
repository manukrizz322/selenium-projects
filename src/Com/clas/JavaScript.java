package Com.clas;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.practice.Property_Set;


public class JavaScript {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		  driver.get("https://www.amazon.in/");
		  
		 /*
		 * WebElement mobles =
		 * driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		 * 
		 * JavascriptExecutor js =(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", mobles);
		 * 
		 * js.executeScript("window.scrollBy(0,9000);");
		 * js.executeScript("window.scrollBy(0,-4500);");
		 * 
		 * WebElement str =
		 * driver.findElement(By.xpath("//h2[normalize-space()='Shop by Brand']"));
		 * String string = js.executeScript("return arguments[0].innerHTML",
		 * str).toString(); System.out.println(string);
		 */
		
	}

}

