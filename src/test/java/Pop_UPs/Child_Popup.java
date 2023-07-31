package Pop_UPs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
		WebDriverManager.chromedriver().setup();
		// opens the browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		String parent = driver.getWindowHandle();
		// address of gear element
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		// address of skillrary essay
		driver.findElement(By.xpath("( //a[text()=' SkillRary Essay'])[2]")).click();
		// shifting control child browser
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}

		driver.findElement(By.id("mytext")).sendKeys("sasikala");
		Thread.sleep(3000);

		driver.switchTo().window(parent);

		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

	}

}
