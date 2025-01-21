package navinChallenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChallengeOneByAshishUbale {
	static WebDriver driver;
	static String url="https://www.worldometers.info/world-population/";
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		long startTime = System.currentTimeMillis();
		while(true) {
			
			long currentTime=System.currentTimeMillis();
			//System.out.println("Current Time: "+currentTime);
			//System.out.println("Difference: "+(currentTime-startTime));
			if((currentTime-startTime)>10000) {
				break;
			}
			else {
				List<WebElement> mainCounterItems=driver.findElements(By.xpath("//div[@class='maincounter-number']/span"));
				System.out.print("Current World Population: ");
				for(WebElement mainCounter: mainCounterItems) {
					System.out.print(mainCounter.getText());
				}
				System.out.println();
				List<WebElement> listBirthToday=driver.findElements(By.xpath("//span[@rel='births_today']"));
				System.out.print("Birth Today: ");
				for(WebElement birthToday: listBirthToday) {
					System.out.print(birthToday.getText());
				}
				System.out.println();
				List<WebElement> listDeathsToday=driver.findElements(By.xpath("//span[@rel='dth1s_today']"));
				System.out.print("Deaths Today: ");
				for(WebElement deaththToday: listDeathsToday) {
					System.out.print(deaththToday.getText());
				}
				System.out.println();
				List<WebElement> listPopulationGrowthToday=driver.findElements(By.xpath("//span[@rel='absolute_growth']"));
				System.out.print("Population Growth Today: ");
				for(WebElement populationGrowthToday: listPopulationGrowthToday) {
					System.out.print(populationGrowthToday.getText());
				}
				System.out.println();
				List<WebElement> listBirthsThisYear=driver.findElements(By.xpath("//span[@rel='births_this_year']"));
				System.out.print("Births This Year: ");
				for(WebElement birthsThisYear: listBirthsThisYear) {
					System.out.print(birthsThisYear.getText());
				}
				System.out.println();
				List<WebElement> listDeathsThisYear=driver.findElements(By.xpath("//span[@rel='dth1s_this_year']"));
				System.out.print("Deaths This Year: ");
				for(WebElement deathsThisYear: listDeathsThisYear) {
					System.out.print(deathsThisYear.getText());
				}
				System.out.println();
				List<WebElement> listPopulationGrowththisyear =driver.findElements(By.xpath("//span[@rel='absolute_growth_year']"));
				System.out.print("Population Growth this year : ");
				for(WebElement populationGrowththisyear: listPopulationGrowththisyear) {
					System.out.print(populationGrowththisyear.getText());
				}
				System.out.println();
			}
		}
		driver.quit();
		
	}

}
