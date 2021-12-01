package Org.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishna" + "n\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get(" http://www.greenstechnologys.com/");

		WebElement contactus = d.findElement(By.xpath("//a[text()='CONTACT US']"));
		contactus.click();

		WebElement name = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Manoj Krishnan J");

		WebElement email = d.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("manukrizz322@gmail.com");

		WebElement phnumber = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		phnumber.sendKeys("9789875190");

		WebElement courses = d.findElement(By.xpath("(//select[@name='courses'])[1]"));
		Select s =new Select(courses);
		s.selectByValue("JAVA/J2EE");
		
		WebElement branch = d.findElement(By.xpath("//select[@name='branch']"));
		Select e =new Select(branch);
		e.selectByValue("Porur");
		
		WebElement time = d.findElement(By.xpath("//select[@name='time']"));
		Select g =new Select(time);
		g.selectByValue("Immediately");
		
	    WebElement message = d.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
		message.sendKeys("9789875190");



	}

}
