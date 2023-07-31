package Navigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Methods {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//navigated to amazon
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		//using back() clicks on back arrow
		driver.navigate().back();
		Thread.sleep(5000);
		//using back() clicks on front arrow
		driver.navigate().forward();
		Thread.sleep(5000);
		//using back() clicks on refresh
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
