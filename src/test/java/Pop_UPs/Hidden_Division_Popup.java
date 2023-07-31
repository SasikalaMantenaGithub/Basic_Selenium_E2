package Pop_UPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		//fetching the address of date
		driver.findElement(By.xpath("//text[text()='Date']")).click();
		
		//fetching the address of respective date
		driver.findElement(By.xpath("//div[text()='Jul']/../../../..//span[text()='26']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
