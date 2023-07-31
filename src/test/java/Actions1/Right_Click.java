package Actions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				//creating an object for the Actions class
				Actions a=new Actions(driver);
                a.contextClick(searchBox).perform();
                Thread.sleep(3000);
                driver.close();
	}

}
