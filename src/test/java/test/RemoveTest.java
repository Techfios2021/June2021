package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemovePage;
import pages.TestBase;

public class RemoveTest extends TestBase {

	WebDriver driver;
	

	@Before
	public void beforeRun() {
		driver = init();
	}

	@Test
	public void removingElement() throws InterruptedException {

		RemovePage removing = PageFactory.initElements(driver, RemovePage.class);
	    Thread.sleep(2000);
		removing.removingelement();
		Thread.sleep(2000);
		removing.remove();
//		Thread.sleep(2000); 
		removing.validateremovedobj();

	}
	
	@After
	public void afterrun() {
		driver.quit();
	}

}
