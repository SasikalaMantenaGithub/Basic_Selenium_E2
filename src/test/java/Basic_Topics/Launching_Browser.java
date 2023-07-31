package Basic_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {

		// this will manage chrome drivers
		WebDriverManager.chromedriver().setup();
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		// maximizes the browser
		driver.manage().window().maximize();
		// enters the url
		driver.get("https://www.facebook.com/");
		// prints the url in the console
		System.out.println(driver.getCurrentUrl());
		// print the title in to console
		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		driver.close();

	}

}
