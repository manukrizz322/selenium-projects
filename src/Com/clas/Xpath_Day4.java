package Com.clas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Day4 {

	public static void main(Object[] args) throws Throwable  {
		
		
		WebDriver d =new ChromeDriver();
		
		d.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
	 d.findElement(By.xpath("//input[@name='username']")).sendKeys("manoj@123");
		
		
		WebElement findElement2 = d.findElement(By.xpath("//input[@name='password']"));
		findElement2.sendKeys("*******");
		
        WebElement findElement3 = d.findElement(By.xpath("//button[@type='submit']"));
		findElement3.click();}}
	

	


