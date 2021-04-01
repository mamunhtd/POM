package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page {
	
	WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Element Library
	
//	@FindBy(how=How.XPATH, using = "//input[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how=How.XPATH, using = "//input[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how=How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how=How.XPATH, using = "//button[text()='Sign in']") WebElement SIGNIN_BUTTON_ELEMENT;
	
	
	
	// Intractive method
	
	public void insertUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
		
	}
	
	public void insertPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
		
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		
	}

}
