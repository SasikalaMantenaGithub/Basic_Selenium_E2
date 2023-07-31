package Web_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected {

	public static void main(String[] args) {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				//address of create new account
				driver.findElement(By.linkText("Create new account")).click();
				//address of radio button
				WebElement radioBtn = driver.findElement(By.xpath("//label[text()='Female']"));
				radioBtn.click();
				//is selected
				if(radioBtn.isSelected()) {
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
				driver.close();

	}

}
