package Actions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
//address of ele 1
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		// address of ele 2
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));

		/// creating an object for Actions class
		Actions a = new Actions(driver);
        a.dragAndDrop(block1, block4).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
