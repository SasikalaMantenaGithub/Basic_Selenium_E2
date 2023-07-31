package Web_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Methods {

	public static void main(String[] args) {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		// address of email address textfield
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
		// gives x and y coordinates
		Point cor = textField.getLocation();
		// printing x and y co ordinares
		System.out.println("X and Y co ordinates are:");
		System.out.println(cor.getX());

		System.out.println(cor.getY());
		// gives height and width
		Dimension size = textField.getSize();
		System.out.println("Height and width are:");
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		// close the application

		driver.close();

	}

}
