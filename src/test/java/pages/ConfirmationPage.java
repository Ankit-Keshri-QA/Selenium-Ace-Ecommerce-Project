package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "center h1")
	private WebElement successMessage;

	@FindBy(css = "[type='checkbox']")
	private WebElement hamburgerMenu;

	@FindBy(css = "[href*='index']")
	private WebElement homePageLink;

	// Methods

	public String getSuccessMessage() {
		String text = successMessage.getText();

		return text;

	}

	public HomePage goToHomePage() {
		hamburgerMenu.click();
		homePageLink.click();

		return new HomePage(driver);
	}

}
