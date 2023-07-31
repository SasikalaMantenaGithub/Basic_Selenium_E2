package Pop_UPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notofication_PopUps {

	public static void main(String[] args) {

		// manages chrome driver
				WebDriverManager.firefoxdriver().setup();
				//handling chrome notifications
				
				//ChromeOptions options=new ChromeOptions();
				//options.addArguments("--disable-notification");
				
				FirefoxOptions option=new FirefoxOptions();
				option.addArguments("--disable-notification");
				
				// opens the browser
				//WebDriver driver = new ChromeDriver(options);
				WebDriver driver = new FirefoxDriver(option);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.skillrary.com/");

	}

}
