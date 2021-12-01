package Com.clas;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Org.practice.Property_Set;

public class Windows_Handling_My_Concept extends Property_Set {

	public static void main(String[] args) {
		property();
		ChromeDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.get("https://www.shopclues.com/wholesale.html");

		act.moveToElement(driver.findElement(By.xpath("//a[text()='Sports & More']"))).click().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Weight Gainers']"))).click().perform();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new LinkedList<>(windowHandles);
		driver.switchTo().window(windows.get(1));
		act.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Tara')])[1]"))).click().perform();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windows1 = new LinkedList<>(windowHandles2);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().window(windows1.get(2));
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Add To Cart']"))).click().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@class='cart_ic']"))).click().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		act.moveToElement(driver.findElement(By.xpath("//p[text()='Grand Total']"))).click().perform();
		System.out.println("Cart Value is" + driver.findElement(By.xpath("//p[text()='Grand Total']")).getText());

	}

}
