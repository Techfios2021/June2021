package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AddPage;
import pages.RemovePage;
import pages.TestBase;

public class RemoveAllTest extends TestBase{
	
	WebDriver driver;
	
	@Before
	public void beforeRun() {
		driver = init();
	}

	@Test
	public void selectRemoveAll() {
		AddPage add = PageFactory.initElements(driver, AddPage.class);
	     add.clickontoggle();
	     RemovePage removing = PageFactory.initElements(driver, RemovePage.class);
	     removing.remove();
	
	}
	
	@After
	public void afterrun() {
		driver.quit();
	}
	

}
