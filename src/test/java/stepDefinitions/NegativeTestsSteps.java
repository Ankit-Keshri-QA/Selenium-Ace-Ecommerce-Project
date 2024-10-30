package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.DriverManager;

public class NegativeTestsSteps {

	WebDriver driver = DriverManager.getDriver();

	SignInPage lp;
	RegistrationPage rp;

	String error1 = "Both Username and Password field are required";
	String error2 = "This field is required";

	@Given("User is on the Sign In Page")
	public void user_is_on_the_sign_in_page() {
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
	}

	@Given("User is on the Registration Page")
	public void user_is_on_the_registration_page() {
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/Registration.html");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		lp = new SignInPage(driver);
		lp.clickLogin();
	}

	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
		rp = new RegistrationPage(driver);
		rp.clickSubmit();
	}

	@Then("User should see the {string} message on the {string}")
	public void user_should_see_the_message_on_the(String string, String page) {
		if ("Login Page".equalsIgnoreCase(page)) {
			Assert.assertEquals(lp.getErrorMessage(), error1);

		} else if ("Register page".equalsIgnoreCase(page)) {
			Assert.assertEquals(rp.getErrorMessage(), error2);
		}
	}

}
