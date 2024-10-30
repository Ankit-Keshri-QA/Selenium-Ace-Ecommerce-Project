package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "center h1") // Assume "id" attribute for salutation dropdown
	private WebElement heading;

	@FindBy(id = "salutation") // Assume "id" attribute for salutation dropdown
	private WebElement salutationDropdown;

	@FindBy(name = "firstname") // Assume "name" attribute for first name field
	private WebElement firstNameField;

	@FindBy(name = "lastname") // Assume "name" attribute for last name field
	private WebElement lastNameField;

	@FindBy(name = "emailId") // Assume "name" attribute for email field
	private WebElement emailField;

	@FindBy(id = "contactNumber") // Assume "name" attribute for contact number field
	private WebElement contactNumberField;

	@FindBy(id = "usr") // Assume "name" attribute for username field
	private WebElement userNameField;

	@FindBy(id = "pwd") // Assume "name" attribute for password field
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit']") // Assume XPath for Submit button
	private WebElement submitButton;

	@FindBy(css = "[class='error']")
	private WebElement errorText;

	// Methods to interact with the form elements

	public void selectSalutation(String salutation) {
		Select salutationSelect = new Select(salutationDropdown);
		salutationSelect.selectByVisibleText(salutation);
	}

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterContactNumber(String contactNumber) {
		contactNumberField.sendKeys(contactNumber);
	}

	public void enterUserName(String userName) {
		userNameField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickSubmit() {
		submitButton.click();
	}

	public String getHeadingText() {
		String headingText = heading.getText();

		return headingText;
	}

	public String getRegisterText() {
		String text = heading.getText();
		return text;
	}

	public String getErrorMessage() {
		String text = errorText.getText();
		return text;
	}

}
