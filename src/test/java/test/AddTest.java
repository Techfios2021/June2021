package test;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pages.AddPage;
import pages.TestBase;


public class AddTest extends TestBase {
	
		
	WebDriver driver;
	
	
	@Before
	public void beforerun() {
		driver = init();
	}
	
	@Test
	public void toggleallcheckbox() throws InterruptedException{
		
		AddPage login = PageFactory.initElements(driver, AddPage.class);
		Thread.sleep(3000);
	    login.clickontoggle();
	    login.toggleselect();
	    login.checkbox1();
	    login.checkbox2();
		}
     
	@After
	public void afterrun() {
		driver.quit();
	}
}
