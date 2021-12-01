package Org.practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Mini_Project_2 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
		
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Manoj");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Krishnan");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("manukrizz322@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9789875190");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
        driver.findElement(By.className("react-datepicker__month-select")).click();
		new Select( driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("October");
		driver.findElement(By.className("react-datepicker__year-select")).click();
		new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1997");
		driver.findElement(By.xpath("//div[text()='19']")).click();
		
		js.executeScript("window.scrollBy(0,600);");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("subjectsInput"))).sendKeys("English");
		
		
		driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__menu')]")).click();
      driver.findElement(By.xpath("//label[text()='Sports']")).click();
	    driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("**********************");
       
        wait .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-3-input']"))).sendKeys("NCR");
	    js.executeScript("window.scrollBy(0,600);");
		wait .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'react-select')]"))).click();
       
		wait .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-4-input']"))).sendKeys("Noida");
		wait .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'react-select')]"))).click();}}
		
		
		
	
		
		

		

	
