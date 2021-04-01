package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Dashboard_Page {
	
	WebDriver driver;
	public Dashboard_Page(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	// Element Library
	
	@FindBy(how=How.XPATH, using = "//h2[contains(text(),'Dashboard')]") WebElement DASHBOARD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//span[text()='Customers']") WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH, using = "//a[text()='Add Customer']") WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	
	
	// Intractive Method
	
	public void validateDashboardPage() {

		WebElement actualElement = DASHBOARD_ELEMENT;
		String expectedVisiableText = "Dashboard";
		Assert.assertEquals(actualElement.getText(), expectedVisiableText, "Page not found");
		
		
	}
	
	public void clickCustomerButton() {
		CUSTOMER_BUTTON_ELEMENT.click();
		
		
	}
	
	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
		
		
	}

}
