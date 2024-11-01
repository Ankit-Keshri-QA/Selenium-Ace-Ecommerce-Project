package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.ShoesPage;
import pages.SignInPage;
import utilities.DriverManager;

public class EndToEndSteps {

	WebDriver driver = DriverManager.getDriver();

	HomePage hp;
	SignInPage lp;
	ShoesPage sp;
	CartPage cp;
	ConfirmationPage ccp;

	@Given("User is on the Home page of the Website")
	public void user_is_on_the_home_page_of_the_website() {
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
	}

	@When("User Click on Hamburger Menu on {string}")
	public void user_click_on_hamburger_menu(String page) {

		if ("Home Page".equalsIgnoreCase(page)) {
			hp = new HomePage(driver);
			hp.clickOnHamburgerMenu();

		} else if ("Confirmation Page".equalsIgnoreCase(page)) {
			hp = ccp.goToHomePage();
		}

	}

	@When("User clicks on the Sign in Link")
	public void user_clicks_on_the_sign_in_link() {
		lp = hp.gotoLoginPage();
	}

	@Then("User enters the {string} and {string}")
	public void user_enters_the_and(String username, String password) {
		lp.enterUsername("EndToEndTestUser");
		lp.enterPassword("Password131");

	}

	@Then("User should be redirected to the Shoes Page")
	public void user_should_be_redirected_to_the_shoes_page() {
		sp = new ShoesPage(driver);
		List<String> shoesList = sp.getProductsName();
		Assert.assertEquals(shoesList.get(0), "Formal Shoes");
	}

	@Then("User clicks on one shoe of his type")
	public void user_clicks_on_one_shoe_of_his_type() {
		cp = sp.goToCartPage();
	}

	@Then("User should be redirected to the Carts Page")
	public void user_should_be_redirected_to_the_carts_page() throws InterruptedException {
		cp.verifyButtonsWorking();
	}

	@Then("User clicks on Add To Cart button")
	public void user_clicks_on_add_to_cart_button() {
		ccp = cp.goToConfirmationPage();
	}

	@Then("User should be redirected to Confirmation page")
	public void user_should_be_redirected_to_confirmation_page() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://anupdamoda.github.io/AceOnlineShoePortal/AddedToCartSuccessfulmessage.html");
	}

	@Then("User should view the success message of purchase")
	public void user_should_view_the_success_message_of_purchase() {
		String message = ccp.getSuccessMessage();
		Assert.assertEquals(message, "Added to Cart Successfully !!!");
	}

	@Then("User clicks on Home link")
	public void user_clicks_on_home_link() {
		ccp.goToHomePage();
	}

	@Then("User should be redirected to the Home Page again")
	public void user_should_be_redirected_to_the_home_page_again() {
		String text = hp.getHeadingText();
		Assert.assertEquals(text, "One Stop Shop for all your Shoes needs!");
	}
}
