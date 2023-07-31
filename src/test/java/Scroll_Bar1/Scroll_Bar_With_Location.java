package Scroll_Bar1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Bar_With_Location {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");

		// address of career
		WebElement ele = driver.findElement(By.xpath("//a[text()='Career']"));
		// fetching x and y co ordinates
		Point coOrdinates = ele.getLocation();

		int x = coOrdinates.getX();

		int y = coOrdinates.getY();

		// Downcasting statement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");

		Thread.sleep(3000);
		ele.click();
		Thread.sleep(3000);
		driver.close();

	}

}
