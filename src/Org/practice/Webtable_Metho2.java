package Org.practice;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtable_Metho2 {
public static void main(String[] args) {
		int sum =0;
	WebDriver driver =new ChromeDriver();
	driver.get("https://letcode.in/table");

	List<WebElement> price = driver.findElements(By.xpath("(//tbody[1])[1]//td[2]"));
	for (WebElement pricelist : price) {
		
		System.out.println(pricelist.getText());
		int parseInt = Integer.parseInt(pricelist.getText());
		
		ArrayList<Integer> li = new ArrayList<Integer>(parseInt);
		li.add(parseInt);
		for (int i = 0; i <li.size(); i++) {sum = sum + li.get(i);}
	}	
			
	String text2 = driver.findElement(By.xpath("//table/tfoot/td[2]")).getText();
	int parseInt2 = Integer.parseInt(text2);
	
	if (parseInt2==sum) {System.out.println("Total ="+sum);}
	
	}}
		
	
	

	


