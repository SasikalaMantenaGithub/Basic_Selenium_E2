package Web_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Displayed_Enabled {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		// address of email textfield
		WebElement textField = driver.findElement(By.xpath("//input[@id='email']"));
		// isDisplayed
		if (textField.isDisplayed()) {
			textField.sendKeys("sasikala");
		} else {
			System.out.println("Textfield is not displayed");
		}
		Thread.sleep(5000);

		WebElement btn = driver.findElement(By.linkText("Create new account"));
		// isEnabled
		if (btn.isEnabled()) {
			btn.click();
		} else {
			System.out.println("Buttonis not enabled");
		}
		driver.close();

	}

}
