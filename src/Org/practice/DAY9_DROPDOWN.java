package Org.practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DAY9_DROPDOWN {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tspsconetimereg.tspsc.gov.in/editOtr23329598.tspsc");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='fadeIn second']")).sendKeys("762187382");
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.xpath("//select[@data-handler='selectMonth']")).click();
		Select sc = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		sc.selectByVisibleText("Jul");
		List<WebElement> options = sc.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement);
		}
		
		driver.findElement(By.className("ui-datepicker-year")).click();
		Select sc1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		sc1.selectByVisibleText("1965");
		driver.findElement(By.linkText("2")).click();
		

	}

}
