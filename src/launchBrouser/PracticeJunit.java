package launchBrouser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJunit {
	
	
	 public static void main(String[] args) throws InterruptedException  {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\savit\\June2021selenium\\1st_Selenium_Project\\driver\\chromedriver.exe");
   	  
		 WebDriver driver = new ChromeDriver();  
   	  
   	  driver.get("https://www.youtube.com/");
   	  driver.findElement(By.id("search")).sendKeys("telugu songs");
   	  driver.findElement(By.id("search-icon-legacy")).click();
   	  
   	  Thread.sleep(3000);
   	  driver.close();
   	 
		
		
		
	}
	

}
