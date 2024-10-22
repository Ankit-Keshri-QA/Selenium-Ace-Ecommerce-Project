package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.SignInPage;

public class LandingPage {

	WebDriver driver;

	HomePage hp;
	SignInPage lp;

	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		hp = new HomePage(driver);
		hp.clickOnHamburgerMenu();
		lp = hp.gotoLoginPage();
	}

	@When("I enter a valid username {string}")
	public void i_enter_a_valid_username(String string) {
		lp.enterUsername("Marshal");
	}

	@When("I enter a valid password {string}")
	public void i_enter_a_valid_password(String string) {
		lp.enterPassword("Password123");
	}

	@When("I enter a valid username {string} and {string}")
	public void i_enter_a_valid_username_and(String user, String pass) {
		lp.enterUsername(user);
		lp.enterPassword(pass);
	}

	@When("I click on the Login button")
	public void i_click_on_the_button() {
		lp.clickLogin();
	}

	@Then("I should be redirected to the products dashboard")
	public void i_should_be_redirected_to_the_products_dashboard() {

	}

	@Then("I should view the products category page")
	public void i_should_view_the_products_category_page() {

	}

}
