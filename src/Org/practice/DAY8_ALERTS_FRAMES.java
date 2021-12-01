package Org.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DAY8_ALERTS_FRAMES {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait= new WebDriverWait(driver,60);
	
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n"
			+ "");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]")).click();
	
	driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']")).sendKeys("bcsbejnene");
	driver.findElement(By.className("login-input-password")).sendKeys("bchbjbjs");
	


	
	
	

	}

}
