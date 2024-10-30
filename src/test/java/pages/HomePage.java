package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Private Locators encapsulated inside the class.

	@FindBy(xpath = "//div[@id='menuToggle']/input")
	private WebElement hamburgerMenu;

	@FindBy(css = "a[href*='Sign']")
	private WebElement signInLink;

	@FindBy(css = "a[href*='Online']")
	private WebElement productsLink;

	@FindBy(css = "a[href*='Contacts']")
	private WebElement contactsLink;

	@FindBy(id = "MainPageText")
	private WebElement mainHeading;

	// Public Methods For User Action Operations

	public void clickOnHamburgerMenu() {

		hamburgerMenu.click();
	}

	public SignInPage gotoLoginPage() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(signInLink));

		signInLink.click();
		return new SignInPage(driver);
	}

	public ProductsPage goToProductsPage() {
		productsLink.click();

		return new ProductsPage(driver);
	}

	public ContactsPage goToContactsPage() {
		contactsLink.click();

		return new ContactsPage(driver);
	}

	public String getHeadingText() {
		String text = mainHeading.getText();
		return text;
	}

}
