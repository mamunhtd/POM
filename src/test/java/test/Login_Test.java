package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dashboard_Page;
import page.Login_Page;
import util.BrowserFactory;

public class Login_Test {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		Login_Page loginPage = PageFactory.initElements(driver, Login_Page.class);
		
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		
		
		Dashboard_Page dashboardPage = PageFactory.initElements(driver, Dashboard_Page.class);
		dashboardPage.validateDashboardPage();
		
		BrowserFactory.tearDown();
		
	}
	
	

}
