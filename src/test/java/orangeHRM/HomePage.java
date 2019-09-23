package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b[text()='Admin']")
	WebElement adminMenuLink;
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement userManagementSubMenu;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement usersLink;
	
	public void clickOnAdminMenuLink(){
		
		/*Actions act=new Actions(driver);
		act.moveToElement(adminMenuLink).perform();*/
		adminMenuLink.click();
	}
	public void hoverToUserManageMentSubMenuLink(){
		
		Actions act=new Actions(driver);
		act.moveToElement(userManagementSubMenu).perform();
	}
	public void clickOnUsersLink(){
		usersLink.click();
	}
	
	 	

}
