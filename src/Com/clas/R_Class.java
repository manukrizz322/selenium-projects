package Com.clas;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class R_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        Actions act = new Actions(driver);
        act.moveToElement(mobile);
		act.contextClick().perform();
        Robot rob = new Robot();
        Thread.sleep(1000);
        
        
       
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		
	
            Thread.sleep(1000);
            rob.keyPress(KeyEvent.VK_ENTER);
		    rob.keyRelease(KeyEvent.VK_ENTER);
	    }
}


