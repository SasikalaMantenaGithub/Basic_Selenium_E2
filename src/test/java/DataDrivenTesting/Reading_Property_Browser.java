package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Property_Browser {

	public static void main(String[] args) throws Throwable {
		// creating an object for properties class
		Properties p = new Properties();
		// creating an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		// load this file
		p.load(fis);
		// access the keys
		String URL = p.getProperty("url");
		String userName = p.getProperty("username");
		String password = p.getProperty("password");
		String browse = p.getProperty("browser");

		WebDriver driver;
		if (browse.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	

	}

}
