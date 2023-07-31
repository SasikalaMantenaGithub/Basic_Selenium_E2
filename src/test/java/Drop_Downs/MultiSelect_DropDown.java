package Drop_Downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect_DropDown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		// fetching the address of dropdown
		WebElement dropDown = driver.findElement(By.id("cars"));

		// Handling dropdowns
		Select s = new Select(dropDown);
		s.selectByIndex(1);
		s.selectByValue("199");
		// s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		Thread.sleep(3000);
		// deselecting the values

		s.deselectByIndex(1);
		s.deselectByValue("199");
		//fetching the values once after deselecting
		List<WebElement> selOpt = s.getAllSelectedOptions();		
		for(WebElement sel:selOpt)
		{
			System.out.println(sel.getText());
		}
		
		// fetching the values
		List<WebElement> Opt = s.getOptions();
		for (WebElement b : Opt) {
			System.out.println(b.getText());
		}

	}

}
