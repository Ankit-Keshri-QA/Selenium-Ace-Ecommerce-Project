package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.DriverManager;

public class RegistrationPageSteps {

	WebDriver driver = DriverManager.getDriver();
	SignInPage lp;
	RegistrationPage rp = new RegistrationPage(driver);

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");

	}

	@When("User Clicks on Registration button")
	public void user_clicks_on_registration_button() {
		lp = new SignInPage(driver);
		rp = lp.goToRegistrationPage();
	}

	@Then("User should see the registration page")
	public void user_should_see_the_registration_page() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://anupdamoda.github.io/AceOnlineShoePortal/Registration.html");

		String text = rp.getHeadingText();

		Assert.assertEquals(text, "User Registration Page");
	}

	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/Registration.html");
	}

	@When("the user enters {string} in the First Name field")
	public void the_user_enters_in_the_first_name_field(String string) {
		rp.enterFirstName("NewUser123");
	}

	@When("the user enters {string} in the Last Name field")
	public void the_user_enters_in_the_last_name_field(String string) {
		rp.enterLastName("LastUser123");
	}

	@When("the user enters {string} in the Email id field")
	public void the_user_enters_in_the_email_id_field(String string) {
		rp.enterEmail("onlyuser@gmail.com");
	}

	@When("the user enters {string} in the Contact Number field")
	public void the_user_enters_in_the_contact_number_field(String string) {
		rp.enterContactNumber("5678765677");
	}

	@When("the user enters {string} in the UserName field")
	public void the_user_enters_in_the_user_name_field(String string) {
		rp.enterUserName("USERNAME12");
	}

	@When("the user enters {string} in the Password field")
	public void the_user_enters_in_the_password_field(String string) {
		rp.enterPassword("pass123");
	}

	@When("the user clicks on the Submit button")
	public void the_user_clicks_on_the_submit_button() {
		rp.clickSubmit();
	}

	@Then("the form should be submitted successfully")
	public void the_form_should_be_submitted_successfully() {
		String url = driver.getCurrentUrl();
		String text = rp.getRegisterText();
		
		Assert.assertEquals(url , "https://anupdamoda.github.io/AceOnlineShoePortal/RegistrationSuccessfulmessage.html");
		Assert.assertEquals(text, "User Registered Successfully !!!");
	}

}
