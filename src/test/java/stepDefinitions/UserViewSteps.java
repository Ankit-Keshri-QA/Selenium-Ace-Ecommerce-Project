package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactsPage;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.DriverManager;

public class UserViewSteps {
	WebDriver driver = DriverManager.getDriver();

	String baseURL = "https://anupdamoda.github.io/AceOnlineShoePortal";

	HomePage hp;
	SignInPage lp;
	RegistrationPage rp;
	ContactsPage cp;

	@Given("User user is on the home page or Landing page")
	public void user_user_is_on_the_home_page_or_landing_page() {
		driver.get(baseURL + "/index.html");
	}

	@When("User clicks on Hamburger menu")
	public void user_clicks_on_Hamburger_menu() {
		hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
	}

	@When("User clicks on Sign In Portal link")
	public void user_clicks_on_Sign_In_Portal_link() {
		lp = hp.gotoLoginPage();
	}

	@When("User clicks on New User button")
	public void user_clicks_on_New_User_button() {
		rp = lp.goToRegistrationPage();
	}

	@When("User clicks on Online Products link")
	public void user_clicks_on_Online_Products_link() {
		hp.goToProductsPage();
	}

	@When("User clicks on Contact link")
	public void user_clicks_on_Contact_link() {
		hp.goToContactsPage();
	}

	@Then("User should be redirected to the Login page")
	public void user_should_be_redirected_to_the_Login_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, baseURL + "/SignIn.html");
	}

	@Then("User should view the credentials input fields to login")
	public void user_should_view_the_credentials_input_fields_to_login() {
		Assert.assertTrue(lp.verifyUsernameField());
		Assert.assertTrue(lp.verifyPasswordField());
	}

	@Then("User should be redirected to the Registration page")
	public void user_should_be_redirected_to_the_Registration_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, baseURL + "/Registration.html");
	}

	@Then("User should view the input fields to register himself")
	public void user_should_view_the_input_fields_to_register_himself() {

	}

	@Then("User should be redirected to the Products page")
	public void user_should_be_redirected_to_the_Products_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, baseURL + "/OnlineProducts.html");
	}

	@Then("User should view the shoes list to buy")
	public void user_should_view_the_shoes_list_to_buy() {
		
	}

	@Then("User should be redirected to the Contacts page")
	public void user_should_be_redirected_to_the_Contacts_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, baseURL + "/Contacts.html");
	}

	@Then("User should view the broken page")
	public void user_should_view_the_broken_page() {
	}

}
