package Org.task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_Testing_1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan"
+ "\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
        d.get("https://www.google.com/");
		d.get("https://www.instagram.com/");
		String title = d.getTitle();
		System.out.println(title);//tittle of the current tab
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);//url of the current tab
		
		d.manage().window().maximize();//maximize the browser
		
		d.get("https://www.whatsapp.com/");
		String title2 = d.getTitle();
		System.out.println(title2);//tittle of the current tab
		String currentUrl2 = d.getCurrentUrl();
		System.out.println(currentUrl2);//url of the current tab
		
		d.get("https://www.swiggy.com/");
		String title3 = d.getTitle();
		System.out.println(title3);//tittle of the current tab
		String currentUrl3 = d.getCurrentUrl();
		System.out.println(currentUrl3);//url of the current tab
		
		d.navigate().to("https://www.flipkart.com/");
		String title4 = d.getTitle();
		System.out.println(title4);//tittle of the current tab
		String currentUrl4 = d.getCurrentUrl();
		System.out.println(currentUrl4);//url of the current tab
		
		d.navigate().back();//back to previous https://www.swiggy.com/
		d.navigate().forward();//forward to next https://www.flipkart.com/
		d.close();//closed the browser
		System.out.println("Browser closed");}}
		
		
		
	
	


