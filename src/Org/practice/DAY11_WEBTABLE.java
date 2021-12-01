package Org.practice;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DAY11_WEBTABLE {
	static int sum ;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

		for (int i = 0; i < column.size(); i++) {
            
			String text = column.get(i).getText();
            if (i == 4) break;
		    int parseInt = Integer.parseInt(text);
		    ArrayList<Integer> list = new ArrayList<Integer>(parseInt);
			list.add(parseInt);
		    for (Integer integer : list) {System.out.println(integer);}
			for (int j = 0; j < list.size(); j++) {sum = sum + list.get(j);}
		}		
				
		
		String text2 = driver.findElement(By.xpath("//table/tfoot/td[2]")).getText();
		int parseInt2 = Integer.parseInt(text2);
		
		if (parseInt2==sum) {
			System.out.println("total price is " + sum);
		}	
		driver.quit();
	}}   

	


