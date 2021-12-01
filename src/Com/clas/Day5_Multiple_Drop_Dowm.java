package Com.clas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5_Multiple_Drop_Dowm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\" + "Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.ironspider.ca/forms/dropdowns.htm");
        
        WebElement multi = d.findElement(By.xpath("//select[@name='coffee2']"));
        Select s = new Select(multi);
        boolean multiple = s.isMultiple();//they are checking, whether the condition is true or false 
        System.out.println(multiple);
        
         s.selectByValue("milk2");
         s.selectByValue("skim");
       
       
         List<WebElement> ss = s.getAllSelectedOptions();
        
        
        
        for (WebElement webElement : ss) {
        	System.out.println(webElement.getText());
        	
			
		}

	}

}
