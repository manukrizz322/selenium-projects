package Com.clas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {




	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		
		d.get("https://demoqa.com/buttons");
		
		WebElement click = d.findElement(By.xpath("//button[text()='Click Me']"));
		Actions act = new Actions(d);
		act.click(click).build().perform();
		
		System.out.println();
		
		WebElement rightclick = d.findElement(By.xpath("//button[text()='Right Click Me']"));
	
		act.contextClick(rightclick).build().perform();
		
		
		WebElement doubleclick = d.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		act.doubleClick(doubleclick).build().perform();
		
	


	}

}
