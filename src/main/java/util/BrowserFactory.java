package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

	static WebDriver driver;
	static String browser = null;
	static String url = null;

	public static void readConfig() {

		Properties prop = new Properties();

		// InputStream // BufferedReader // FileReader // Scanner

		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("Used Browser : " + browser);
			url = prop.getProperty("url");
			System.out.println("Used Environment : " + url);

		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

	public static WebDriver init() {

		readConfig();

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

	public static void tearDown() {
		try {
			driver.close();
			driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
