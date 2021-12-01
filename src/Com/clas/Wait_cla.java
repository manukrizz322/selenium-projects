package Com.clas;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Wait_cla {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("dywhdbwjjw");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345578");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();


		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']")));

		//WebElement findElement2 = driver.findElement(By.xpath("//input[@name='lastname']"));
		//findElement2.sendKeys("ggvhmj");
		
		  Wait<WebDriver> wait4 = new FluentWait<WebDriver>(driver)
		  .withTimeout(Duration.ofSeconds(20)) .pollingEvery(Duration.ofSeconds(2))
		  .ignoring(NoSuchElementException.class);
		 
		  WebElement profile= wait4.until(new Function<WebDriver, WebElement>() {
		  
		  
		  public WebElement apply(WebDriver driver) {
		  
		  return driver.findElement(By.xpath("//input[@name='lastname']")); } });
		  
		 
		  profile.sendKeys("ghjjkjjll");
		 
		

	}

}
