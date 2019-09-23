package framework_orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pageObjects {
	
	public WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	public Login_pageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String value){
		userName.sendKeys(value);;
	}
	public void enterPassword(String value){
		password.sendKeys(value);;
	}
	public void clickLoginButton(){
		loginButton.click();
	}
	
	

}
