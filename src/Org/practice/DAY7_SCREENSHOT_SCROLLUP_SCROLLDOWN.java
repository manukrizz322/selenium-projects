package Org.practice;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class DAY7_SCREENSHOT_SCROLLUP_SCROLLDOWN {
public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("motorola"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-price a-text-price']//preceding-sibling::span)[1]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windows);
		driver.switchTo().window(list.get(1));
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("./screen/snap.png");
		FileHandler.copy(src, des);
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//span[@class='a-price a-text-price']//preceding-sibling::span)[3]")).click();
		Set<String> windows1 = driver.getWindowHandles();
		list.clear();
		list.addAll(windows1);
		driver.switchTo().window(list.get(2));
		File src1 = shot.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./screen/snap1.png");
		FileHandler.copy(src1, des1);
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//span[@class='a-price a-text-price']//preceding-sibling::span)[5]")).click();
		Set<String> windows2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windows2);
		driver.switchTo().window(list.get(3));
		File src2 = shot.getScreenshotAs(OutputType.FILE);
		File des2 = new File("./screen/snap2.png");
		FileHandler.copy(src2, des2);
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//span[@class='a-price a-text-price']//preceding-sibling::span)[7]")).click();
		Set<String> windows3 = driver.getWindowHandles();
		list.clear();
		list.addAll(windows3);
		driver.switchTo().window(list.get(4));
		File src3 = shot.getScreenshotAs(OutputType.FILE);
		File des3 = new File("./screen/snap3.png");
		FileHandler.copy(src3, des3);}}
		
		

		
	


