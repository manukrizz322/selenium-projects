package Org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Q5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishna" + "n\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		WebElement button = d.findElement(By.xpath("(//button[@class='btn'])[1]"));
		button.click();
		
		WebElement questions = d.findElement(By.xpath("(//a[@data-toggle='collapse'])[30]"));
		questions.click();
		
		


	}

}
