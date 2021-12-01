package Org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Q7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishna" + "n\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.get(" https://www.cleartrip.com/trains");
		
		WebElement from = d.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
		from.sendKeys("Chennai");
		
		WebElement to = d.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
		to.sendKeys("trivandrum");
		
		WebElement coach = d.findElement(By.xpath("//select[contains(@class,'required span span24')]"));
		Select s = new Select(coach);
		s.selectByIndex(3);
		
		WebElement calender = d.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		calender.click();
		
		WebElement next = d.findElement(By.xpath("//a[contains(@id,'cal_showNextMonth')]"));
		next.click();
		
		WebElement date = d.findElement(By.xpath("(//a[contains(@href,'javascript: void(0);')])[49]"));
		date.click();
		
		WebElement adult = d.findElement(By.xpath("(//select[contains(@class,'span span24')])[2]"));
		Select u = new Select(adult);
		u.selectByIndex(3);
		
		WebElement children = d.findElement(By.xpath("//select[contains(@name,'children')]"));
		Select t = new Select(children);
		t.selectByIndex(1);
		
		WebElement submit = d.findElement(By.xpath("//button[contains(@id,'trainFormButton')]"));
		submit.click();
		
		WebElement text = d.findElement(By.xpath("(//h2[contains(text(),'Train')])[1]"));
		String text2 = text.getText();
		System.out.println(text2);
		
		
		
	
		
		
		
		

	}

}
