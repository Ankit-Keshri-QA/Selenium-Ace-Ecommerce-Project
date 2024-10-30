package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h2")
	private WebElement cartPageHeading;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radioButtons;

	@FindBy(css = "button[class*='AddToCart']")
	private List<WebElement> addToCartButton;

	// Methods

	public void verifyButtonsWorking() throws InterruptedException {
		for (WebElement radio : radioButtons) {
			radio.click();
			Thread.sleep(2000);
		}

	}

	public ConfirmationPage goToConfirmationPage() {
		int randomNumber = (int) (Math.random() * 3) + 1;
		WebElement mainButton = addToCartButton.get(randomNumber);
		mainButton.click();

		return new ConfirmationPage(driver);

	}
}
