package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.util.Properties;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Property {

	public static void main(String[] args) throws Throwable {
		
		//creating an object for properties class
		Properties p=new Properties();
		//creating an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		//load this file
		p.load(fis);
		//access the keys
		String URL = p.getProperty("url");
		String userName = p.getProperty("username");
		String password = p.getProperty("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

}
