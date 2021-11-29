package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemovePage {
	
	@FindBy (how=How.NAME, using="todo[1]") WebElement CHECK_FIRST_ONE1;
	@FindBy (how=How.CSS, using="body > div.controls > input[type=submit]:nth-child(1)") WebElement REMOVE_ELEMENT;


	public void removingelement() {
		((WebElement) CHECK_FIRST_ONE1).click();
		
	}
	
     public void remove() {
    	 ((WebElement) REMOVE_ELEMENT).click();
     }
     
     public void validateremovedobj() {
    	 try {
    	if((CHECK_FIRST_ONE1).isDisplayed()) { 
    		
    		System.out.println("Element did not removed");
    	}
    	else {
    		System.out.println("Element removed");
    	}
    	 }
    	 catch(Exception e){
    		 System.out.println("exception caught");
    	 }
     }
     
}
