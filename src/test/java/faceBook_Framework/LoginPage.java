package faceBook_Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	@FindBy(id = "email")
	WebElement txt_Email;

	@FindBy(id = "pass")
	WebElement txt_Password;

	@FindBy(name = "login")
	WebElement btn_Login;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {

		txt_Email.sendKeys(email);
	}

	public void enterPassword(String pass) {

		txt_Email.sendKeys(pass);
	}
	public void clickLoginButton() {

		btn_Login.click();
	}
}
