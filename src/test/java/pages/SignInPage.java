package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("Driver in HomePage: " + driver);
		PageFactory.initElements(driver, this);
	}

	// Private Locators encapsulated inside the class.

	@FindBy(id = "usr")
	private WebElement username;

	@FindBy(id = "pwd")
	private WebElement password;

	@FindBy(css = "input[type = 'submit']")
	private WebElement loginButton;

	@FindBy(id = "NewRegistration")
	private WebElement registerButton;

	@FindBy(css = "[class='error']")
	private WebElement errorText;

	// Public methods to perform user actions

	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}

	public boolean verifyUsernameField() {
		return username.isDisplayed();
	}

	public boolean verifyPasswordField() {
		return password.isDisplayed();
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLogin() {
		loginButton.click();
	}

	public RegistrationPage goToRegistrationPage() {
		registerButton.click();
		return new RegistrationPage(driver);
	}

	public String getErrorMessage() {
		String text = errorText.getText();

		return text;
	}

}
