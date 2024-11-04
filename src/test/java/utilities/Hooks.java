package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.WebDriver;


public class Hooks {

	private WebDriver driver;
	

	@Before
	public void setUp(Scenario scenario) {
		
		driver = DriverManager.getDriver(); // Get the WebDriver from DriverManager
		
	}

	@After
	public void tearDown(Scenario scenario) {

		
		DriverManager.closeDriver(); // Close the WebDriver
	}

}
