package Org.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath_Day3_Task2 {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\"
				+ "Manojkrishnan\\eclipse-workspace\\"
				+ "Selenium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement findElement2 = d.findElement(By.xpath("//h2[contains(text(),'you')]"));
		 String text = findElement2.getText();
		 System.out.println(text);
		 
		 WebElement findElement3 = d.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]"));
		 findElement3.sendKeys("absghcjdhf");
		 
		 WebElement findElement4 = d.findElement(By.xpath("//input[contains(@type,'password')]"));
		 findElement4.sendKeys("**********");
		 
		 WebElement findElement = d.findElement(By.xpath("//a[contains(text(),'Forgo')]"));//Full text is Forgotten password
		findElement.click();//clicked to forgotten password
}}
		
		 
	
	
		


	


