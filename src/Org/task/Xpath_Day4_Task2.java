package Org.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath_Day4_Task2 {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\" + "Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
         d.get("https://www.facebook.com/");
         WebElement newaccount  = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccount.click();
		
		Thread.sleep(2000);
		WebElement firstname = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Manoj");

		WebElement surname = d.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("Krishnan");

		WebElement phonenumber = d.findElement(By.xpath("//input[@aria-label='Mobile"
				                                         + " number or email address']"));
		phonenumber.sendKeys("123456789");

		WebElement password = d.findElement(By.xpath("//input[@data-type='password']"));
		password.sendKeys("*********");
		
		WebElement day = d.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s =new Select(day);
		s.selectByValue("12");
		
		WebElement month = d.findElement(By.xpath("//select[@aria-label='Month']"));
		Select f =new Select(month);
		f.selectByIndex(5);
		
	    WebElement year = d.findElement(By.xpath("//select[@aria-label='Year']"));
		Select r =new Select(year);
		r.selectByValue("1997");
		
		 WebElement gender = d.findElement(By.xpath("(//input[@type='radio'])[2]"));
	     gender.click();
			
		  WebElement submit = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
			submit.click();}}
		
		

	


