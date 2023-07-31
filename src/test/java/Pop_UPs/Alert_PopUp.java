package Pop_UPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_PopUp {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://demoapp.skillrary.com/");
				//address of course
				WebElement course = driver.findElement(By.id("course"));
				
				Actions a=new Actions(driver);
				a.moveToElement(course).perform();
				//address of selenium training
				driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
				//adress of Add to cart
				driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
				//shifting our control to pop up
				//driver.switchTo().alert().accept();
				driver.switchTo().alert().dismiss();
				Thread.sleep(3000);
				driver.quit();
				
				
				
				

	}

}
