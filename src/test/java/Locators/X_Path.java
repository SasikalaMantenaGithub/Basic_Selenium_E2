package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// used css locator
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sasi");
		//xpath  attribute
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		//xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
	}

}
