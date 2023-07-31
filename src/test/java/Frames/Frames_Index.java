package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Index {

	public static void main(String[] args) {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");

		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		// switching to frame
		// driver.switchTo().frame(0);

		// switching our control with Id value
		// driver.switchTo().frame("loginIframe");

		// switching our control with Id value
		driver.switchTo().frame("iframeLogin");
		// sending some data into the textfield
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("1234");

		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();

		// shifting the control back to web page
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("123456");

	}

}
