package Org.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Alert {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace" + "\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://demoqa.com/alerts");
		

		WebElement text1 = d.findElement(By.xpath("//span[normalize-space(text())='Click Button to see alert']"));
		System.out.println(text1.getText());

		WebElement simplealert = d.findElement(By.xpath("(//button[contains(text(),'e')])[1]"));
		simplealert.click();
		Alert alert1 = d.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();

		WebElement text2 = d.findElement(
		By.xpath("//span[normalize-space(text())='On button" + " click, alert will appear after 5 seconds']"));
		System.out.println(text2.getText());

		WebElement simplealert1 = d.findElement(By.xpath("(//button[contains(text(),'c')])[2]"));
		simplealert1.click();
		Thread.sleep(6000);
		Alert alert2 = d.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();

		WebElement text3 = d.findElement(By.xpath("(//span[contains(text(),',')])[2]"));
		System.out.println(text3.getText());

		WebElement confirmalert = d.findElement(By.xpath("(//button[contains(text(),'l')])[3]"));
		confirmalert.click();
		Alert alert3 = d.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.dismiss();

		WebElement text4 = d.findElement(By.xpath("(//span[contains(text(),'click')])[3]"));
		System.out.println(text4.getText());

		WebElement promtalert = d.findElement(By.xpath("(//button[contains(text(),' ')])[4]"));
		promtalert.click();
		Alert alert4 = d.switchTo().alert();
		alert4.sendKeys("Running Sucessfully");
		System.out.println(alert4.getText());
		alert4.accept();

	}

}
