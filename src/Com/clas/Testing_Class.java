package Com.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan"
				+ "\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String currenturl =driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//navigate
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
