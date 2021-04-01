package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Page {
	
	
	// DropDown Concept
	public void selectDropdown(WebElement element, String visiableText) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(visiableText);
		
	}
	
	
	// Random Generate Number
	public int randomGenerator(int bound) {
		Random rnd = new Random();
//		int randomNumber = rnd.nextInt(bound);
		int randomNumber = rnd.nextInt();
		return randomNumber;
			
	}
	
	//Explicity wait
		public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));

		}

}
