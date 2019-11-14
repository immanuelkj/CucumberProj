package org.test.cts.test.TestngClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass extends BaseClass {
	
	
	public POJOClass(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	
	private WebElement userr;
	
	@FindBy(id="pass")
	
	private WebElement pas;
	
	@FindBy(id="u_0_b")
	
	private WebElement btn;
	
	@FindBy(xpath="(//select[@class='input-xlarge'])[1]")
	
	private WebElement drop;
	

	



	public WebElement getUserr() {
		return userr;
	}



	public WebElement getBtn() {
		return btn;
	}



	

	

	public WebElement getPas() {
		return pas;
	}




	public WebElement getDrop() {
		return drop;
	}
	

	


	
}
