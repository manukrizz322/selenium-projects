package Org.practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DAY5_ACTIONS_MOUSEOVERACTION_DRAG_AND_DROP {
	
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Drivver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		Robot rob = new Robot();

		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
	}

}
