package Actions;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));

		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));

		Thread.sleep(5000);

		Actions a = new Actions(driver);
		a.dragAndDrop(block1, block4).perform();
		
		a.sendKeys(Keys.TAB).perform();
		
	}

}
