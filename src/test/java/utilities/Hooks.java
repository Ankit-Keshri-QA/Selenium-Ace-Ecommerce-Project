package utilities;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverManager.getDriver(); // Get the WebDriver from DriverManager
	}

	@After
	public void tearDown() {
		DriverManager.closeDriver(); // Close the WebDriver
	}

}
