package Com.clas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_8_Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace"
				+ "\\Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions act =new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		
		
		WebElement to = driver.findElement(By.id("droppable"));
		
		
		act.dragAndDrop(from, to).perform();
		

	}

}
