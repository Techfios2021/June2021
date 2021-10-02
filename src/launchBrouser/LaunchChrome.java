package launchBrouser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

      public static void main(String[] args) throws InterruptedException {
		
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\savit\\June2021selenium\\1st_Selenium_Project\\driver\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver();  
    	  
    	  driver.get("https://www.google.com/");
    	  driver.findElement(By.name("q")).sendKeys("selenium");
    	  
    	  Thread.sleep(3000);
    	  driver.close();
    	  
	}
}
