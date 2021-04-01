package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer_Page extends Base_Page {
	
	WebDriver driver;
	public AddCustomer_Page(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Eelment library
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement USERNAME_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']") WebElement COMPANY_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='email']") WebElement EMAIL_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='phone']") WebElement PHONE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='address']") WebElement ADDRESS_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='city']") WebElement CITY_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='state']") WebElement STATE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='zip']") WebElement POSTALCODE_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//select[@name='country']") WebElement COUNTRY_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//select[@id='currency']") WebElement CURRENCY_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//select[@id='group']") WebElement GROUP_FIELD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//button[@id='submit']") WebElement SUBMIT_BUTTON_FIELD_ELEMENT;
	
	
	//Intractive Method
	
	public void insertFullName(String fullName) {
		waitForElement(driver, 10, USERNAME_FIELD_ELEMENT);
		int generatedNumber = randomGenerator(999);
		USERNAME_FIELD_ELEMENT.sendKeys(fullName + generatedNumber);
		
	}

	public void selectCompanyNameOption(String company) {
		
		selectDropdown(COMPANY_FIELD_ELEMENT, company );
	}
	
	public void insertEmail(String emailid) {
		int generatedNumber = randomGenerator(999);
		EMAIL_FIELD_ELEMENT.sendKeys(generatedNumber + emailid);
	}
	
	public void insertPhoneNumber(String phonenumber) {
		int generatedNumber = randomGenerator(999);
		PHONE_FIELD_ELEMENT.sendKeys(phonenumber + generatedNumber);
		
	}
	
	public void insertAddresss(String Address) {
		
		ADDRESS_FIELD_ELEMENT.sendKeys(Address);
	}
	
	public void insertCity(String city) {
		
		CITY_FIELD_ELEMENT.sendKeys(city);
	}
	
	public void insertState(String state) {
		
		STATE_FIELD_ELEMENT.sendKeys(state);
	}
	
	public void insertZipCode(String zip) {
		
		POSTALCODE_FIELD_ELEMENT.sendKeys(zip);
		
	}
	
	public void selectCountry(String country) {
		
		selectDropdown(COUNTRY_FIELD_ELEMENT, country);
		
	}
	

	public void selectCurrency(String currency) {
		
		selectDropdown(CURRENCY_FIELD_ELEMENT, currency);
		
	}
	
	public void selectGroup(String group) {
		
		selectDropdown(GROUP_FIELD_ELEMENT, group);
		
	}
	
	public void clickSubmitButton() {
		
		SUBMIT_BUTTON_FIELD_ELEMENT.click();
		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
