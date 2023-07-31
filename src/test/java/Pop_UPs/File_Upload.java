package Pop_UPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {

	public static void main(String[] args) {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.foundit.in/");
				//addrees of uplod
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				//sendkeys uploading file
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Resumes\\Sasi_Resume.pdf");

	}

}
