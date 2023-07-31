package Drop_Downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DD_Amazon {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				//address of drop down
				 WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				 //creating an object for select class
				 Select s=new Select(dropDown);
				 //selecting the value by index
				 s.selectByIndex(5);
				 Thread.sleep(4000);
				 //selecting the value by value
				 s.selectByValue("search-alias=automotive");
				 Thread.sleep(4000);
				//selecting the value by visible text
				 s.selectByVisibleText("Beauty");
				 Thread.sleep(4000);
				 
				 //fetch all the values inside a drop down
				List<WebElement> allOptions = s.getOptions();
				for(WebElement b:allOptions) {
					System.out.println(b.getText());
				}
				driver.close();
				 
				 
				 
				 

	}

}
