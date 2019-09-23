package ownAssignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IdentifyBrokenLinks {
	
	@Test
	public void identifyAllLinksAlongWithBrokenLinks() throws MalformedURLException, IOException{
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		allLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of all links and images : "+allLinks.size());
		
		List<WebElement> activeLinks= new ArrayList<WebElement>();
		
		/*for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getAttribute("href"));
			if(allLinks.get(i).getAttribute("href")!=null && !(allLinks.get(i).getAttribute("href").contains("javascript"))){
				activeLinks.add(allLinks.get(i));
			}
		}*/
		
		for(int i=0;i<allLinks.size();i++){
			try{
				
				WebElement link=allLinks.get(i);
				String urlLink=link.getAttribute("href");
				//System.out.println(urlLink);
				if(urlLink!=null && !link.getAttribute("href").contains("javascript")){
					System.out.println(urlLink);
					verifyUrl(urlLink);
				}
				/*HttpURLConnection con=(HttpURLConnection) new URL(activeLinks.get(i).getAttribute("href")).openConnection();
				con.connect();
				String response=con.getResponseMessage();
				con.disconnect();
				System.out.println(activeLinks.get(i).getAttribute("href") +"----->"+response);*/
			}
			catch(ClassCastException e){
				e.printStackTrace();
			}
		}
		
	}
	public static void verifyUrl(String linkUrl) throws ClassCastException,MalformedURLException,IOException{
		try{
			URL url=new URL(linkUrl);
			HttpURLConnection httpURlConnection=(HttpURLConnection)url.openConnection();
			httpURlConnection.setConnectTimeout(3000);
			httpURlConnection.connect();
			if(!(httpURlConnection.getResponseCode()==200)){
				System.out.println(linkUrl+ " - "+ httpURlConnection.getResponseMessage());
			}
			if(httpURlConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+ " - "+ httpURlConnection.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		}
		catch(ClassCastException e){
			e.printStackTrace();
		}
	}

}
