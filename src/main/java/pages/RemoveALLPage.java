package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveALLPage {

	@FindBy (how=How.NAME, using="allbox") WebElement TOGGLE_CHECKBOX_ELEMENT;
	@FindBy (how=How.CSS, using="body > div.controls > input[type=submit]:nth-child(1)") WebElement REMOVE_ELEMENT;
	
	
}
