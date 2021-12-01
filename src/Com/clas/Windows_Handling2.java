package Com.clas;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Windows_Handling2 {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace"
				+ "\\Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        Actions act = new Actions(driver);
		Robot rob = new Robot();

		WebElement giftcards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		act.contextClick(giftcards).perform();
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	    WebElement bestseller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		act.contextClick(bestseller).perform();
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		WebElement A = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(A).perform();
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		WebElement B = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(B).perform();
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		WebElement C = driver.findElement(By.xpath("//a[text()='Computers']"));
		act.contextClick(C).perform();
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		/**
		 * Thread.sleep(1000); String windowHandle = driver.getWindowHandle();
		 * System.out.println(windowHandle); Thread.sleep(1000); driver.close();
		 */
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {

			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);

		}
		String mob = "mobile Phones: buy New mobiles Online at Best Prices in india | buy Cell Phones online - amazon.in";

		for (String string : windowHandles) {

			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(mob)) {
				System.out.println("process done...");
				break;

			}
		}
	}
}
