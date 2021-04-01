package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomer_Page;
import page.Dashboard_Page;
import page.Login_Page;
import util.BrowserFactory;

public class AddCustomer_Test {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		

		driver = BrowserFactory.init();
		
		Login_Page loginPage = PageFactory.initElements(driver, Login_Page.class);
		
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		
		Dashboard_Page dashboardPage = PageFactory.initElements(driver, Dashboard_Page.class);
		
		dashboardPage.validateDashboardPage();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		AddCustomer_Page addCustomerPage = PageFactory.initElements(driver, AddCustomer_Page.class);
		addCustomerPage.insertFullName("Selenium Planet");
		addCustomerPage.selectCompanyNameOption("Google");
		addCustomerPage.insertEmail("mamun@gmail.com");
		addCustomerPage.insertPhoneNumber("753951");
		addCustomerPage.insertAddresss("SweetHome");
		addCustomerPage.insertCity("Smile City");
		addCustomerPage.insertState("DHAKA");
		addCustomerPage.insertZipCode("1214");
		addCustomerPage.selectCountry("Bangladesh");
		addCustomerPage.selectCurrency("USD");
		addCustomerPage.selectGroup("AUG 2020");
		
		addCustomerPage.clickSubmitButton();
		
		
		
		
		
		
		
	}

}
