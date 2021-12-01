
package Com.clas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\"
			+ "eclipse-workspace\\Selenium_Testing\\Drivver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	//findElement----find the element---webElement
	//findElements---find the elements----List<webElement>
	
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("manojkrizz322@gmail.com");
	
	WebElement input2 = driver.findElement(By.name("pass"));
	input2.sendKeys("123343435");

	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	
	
	
	}


}
	
	
	


