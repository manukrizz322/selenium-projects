package Com.clas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamic_Xpath {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.myntra.com");
		
		driver.findElement(By.xpath("//*[@*='desktop-searchBar']")).sendKeys("shirts"+Keys.ENTER);
		
		List<Integer> pricelist = new ArrayList<Integer>();
		List<WebElement> firstproduct = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		for (int i = 0; i <firstproduct.size(); i++) {
			String text = firstproduct.get(i).getText().replace("Rs. ","");
			int parseInt = Integer.parseInt(text);
			pricelist.add(parseInt);}
			
		System.out.println(pricelist);
		
		System.out.println("Total count :"+pricelist.size());
		
		System.out.println("MAX PRICE :"+Collections.max(pricelist));
		
		System.out.println("MIN PRICE :"+Collections.min(pricelist));}}
		
		
		
		
		

	


