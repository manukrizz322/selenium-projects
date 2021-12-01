package Org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         
	         driver.get("https://www.lvbankonline.in/index.html?module=login");

	}

}
