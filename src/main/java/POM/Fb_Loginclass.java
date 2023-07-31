package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginclass {
	// Declaration
	@FindBy(id = "email")
	private WebElement emailTf;

	@FindBy(id = "pass")
	private WebElement passTf;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;

	// Initialization
	public Fb_Loginclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// creting getter and setter methods
	public WebElement getEmailTf() {
		return emailTf;
	}

	
	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPassTf() {
		return passTf;
	}

	public void setPassTf(WebElement passTf) {
		this.passTf = passTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;

	}

//utilization
	public void emailTextField(String data) {
		emailTf.sendKeys(data);

	}

	public void passTextField(String data) {
		passTf.sendKeys(data);
	}

	public void loginButton() {
		loginBtn.click();
	}

}
