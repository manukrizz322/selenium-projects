package Org.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath_Day3_Task1 {
public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
        d.get("https://www.facebook.com/");
		WebElement findElement = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		findElement.click();
		
		Thread.sleep(2000);
		WebElement findElement1 = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		findElement1.sendKeys("Manoj");

		WebElement findElement2 = d.findElement(By.xpath("(//input[@type='text'])[3]"));
		findElement2.sendKeys("Krishnan");

		WebElement findElement3 = d.findElement(By.xpath("//input[@aria-label='Mobile"
				                                         + " number or email address']"));
		findElement3.sendKeys("8124493722");

		WebElement findElement4 = d.findElement(By.xpath("//input[@data-type='password']"));
		findElement4.sendKeys("*********");
		
		WebElement findElement6 = d.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s =new Select(findElement6);
		s.selectByIndex(18);
		WebElement findElement7 = d.findElement(By.xpath("//select[@aria-label='Month']"));
		Select f =new Select(findElement7);
		f.selectByIndex(9);
	    WebElement findElement8 = d.findElement(By.xpath("//select[@aria-label='Year']"));
		Select r =new Select(findElement8);
		r.selectByIndex(26);
		
	    WebElement findElement5 = d.findElement(By.xpath("(//input[@type='radio'])[2]"));
		findElement5.click();
		
	    WebElement findElement9 = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
		findElement9.click();}}
		

	

		
	


