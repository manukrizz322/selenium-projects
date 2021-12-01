package Com.clas;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspac" + "e\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		Robot rob = new Robot();
		
		WebElement A = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(A).perform();
		Thread.sleep(1000);

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(electronics).perform();

		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
		act.contextClick(computers).perform();

		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
		}
		String comp ="Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
		
		for (String string : windowHandles) {
			
			if ( driver.switchTo().window(comp).getTitle().equals(comp)) {
				System.out.println("process done...");
				break;
				
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
