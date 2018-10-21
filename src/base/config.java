package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.SWDFunctions;

public class config extends SWDFunctions{


	@BeforeTest
	public void beforeTestSuiteStart() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Ayshi\\eclipse-workspace\\Jars//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

	//domain
	//browser
	//driver










}
