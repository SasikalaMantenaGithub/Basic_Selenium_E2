package Scripts_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Fb_Loginclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLoginScript {

	public static void main(String[] args) throws Throwable {
		//creating an object for properties class
				Properties p=new Properties();
				//creating an object for physical file
				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
				//load this file
				p.load(fis);
				//access the keys
				String URL = p.getProperty("url");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(URL);
				//creating an object for Fb_Loginclass
				Fb_Loginclass fbLogin =new Fb_Loginclass(driver);
				fbLogin.emailTextField("sasi");
				fbLogin.passTextField("kala");
				fbLogin.loginButton();
				
				driver.close();				
	}

}
