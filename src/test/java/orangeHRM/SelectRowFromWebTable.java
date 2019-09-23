package orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectRowFromWebTable {
	WebDriver driver;
	LoginPage page;
	HomePage hPage;
	@BeforeTest
	public void launchSite(){
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		signIn();
		
	}
	public void signIn(){
		page=new LoginPage(driver);
		page.enterUserName();
		page.enterPassword();
		page.clickLoginButton();
	}
	@Test(priority=1)
	public void navigateToListUsersPage() throws InterruptedException{
		hPage=new HomePage(driver);
		Thread.sleep(5000);
		hPage.clickOnAdminMenuLink();
		Thread.sleep(5000);
		/*hPage.hoverToUserManageMentSubMenuLink();
		Thread.sleep(5000);
		hPage.clickOnUsersLink();*/
	}
	@Test(priority=2)
	public void selectUserFromTable(){
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of Rows: "+rows.size());
		List<WebElement> cellCount=rows.get(0).findElements(By.xpath("th | td"));
		System.out.println("Number of Cells: "+cellCount.size());
		for(int i=1;i<rows.size();i++){
			for(int j=1;j<=cellCount.size();j++){
				String cellValue=table.findElement(By.xpath("//tr["+i+"]/th["+j+"] | //tr["+i+"]/td["+j+"]")).getText();
				System.out.print(cellValue+ "  ");
				if(cellValue.equalsIgnoreCase("Russel Hamilton")){
					driver.findElement(By.xpath("//td[text()='Russel Hamilton']/preceding-sibling::td/input")).click();
				}
			}
			System.out.println();
		}
				
	}

}
