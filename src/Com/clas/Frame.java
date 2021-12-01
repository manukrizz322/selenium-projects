package Com.clas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");
		
		int size = d.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		d.switchTo().frame(0);
		WebElement findElement = d.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("tester");
		
		
		
		
		
		
		


	}

}
