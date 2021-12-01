package Com.clas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");

		WebElement table = driver.findElement(By.id("simpletable"));

		List<WebElement> headder = table.findElements(By.tagName("th"));
		for (WebElement header : headder) {
			String c = header.getText();

			System.out.println(c);
		}

		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println(size);
		if (size == 3) {
			System.out.println("passed");
		} else
			System.out.println("not passed");

		for (WebElement rows : allrows) {
			String text = rows.findElements(By.tagName("td")).get(0).getText();
			System.out.println(text);
		}
		// List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		for (int i = 0; i < size; i++) {
			List<WebElement> data = allrows.get(i).findElements(By.tagName("td"));
			System.out.println(data.get(1).getText());
			if (data.get(1).getText().equals("Raj")) {
				data.get(3).findElement(By.id("second")).click();
				break;
			}

		}

		driver.quit();

	}

}
