package Org.practice;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
public class DAY4_DEBUG_XPATH_TEXT_CONTAINS_GETTEXT_GETATRRIBUTE {
	public static void main(String[] args) throws Throwable {
      System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		// driver.get("https://www.snapdeal.com/product/bhawna-collection-loard-shiv-trishul/672311651336");
		//System.out.println(driver.getTitle());
	driver.findElement(By.xpath("(//div[contains(text(),'bhawna')])[1]")).click();
     Set<String> windowHandles = driver.getWindowHandles();
      String s = "bhawna collection Loard Shiv" + " Trishul Damru Locket With Puchmukhi"
				+ " Rudraksha Mala Gold-plated Brass, Wood: " + "Buy bhawna collection Loard Shiv Trishul Damru"
				+ " Locket With Puchmukhi Rudraksha Mala Gold-plated Brass,"
				+ " Wood at Best Price in India on Snapdeal";

		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(s)) {
				driver.findElement(By.xpath("//span[text()='add to cart']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//div[contains(text(),'View')])[2]")).click();
				Thread.sleep(1000);
				String text = driver.findElement(By.xpath("(//span[text()='Rs. 129'])[2]")).getText();
				System.out.println(text);
				
				
				break;
			}
							}}}
		
	
	
	
	
	

            
		

	

