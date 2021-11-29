package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddPage {
	
	WebDriver driver;
	
	
	@FindBy (how=How.NAME, using="allbox") WebElement TOGGLE_CHECKBOX_ELEMENT;
	@FindBy (how=How.NAME, using="todo[0]") WebElement CHECK_FIRSTONE;	
	@FindBy (how=How.NAME, using="todo[1]") WebElement CHECK_SECONDONE;
	

  
	public void clickontoggle() {
//		driver.findElement(By.xpath("//input[@name='allbox']")).click();
		TOGGLE_CHECKBOX_ELEMENT.click();
	}
	
	public boolean toggleselect(){
		
		if(TOGGLE_CHECKBOX_ELEMENT.isSelected()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		return false;	
	}	
	
	public boolean checkbox1() {
		
		if(CHECK_FIRSTONE.isSelected()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		return false;
			
	}	
		public boolean checkbox2() {
		
		if(CHECK_SECONDONE.isSelected()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		return false;	
	}
		
	
	
}