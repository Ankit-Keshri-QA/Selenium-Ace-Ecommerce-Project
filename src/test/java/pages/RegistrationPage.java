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

	@FindBy(id = "salutation") // Assume "id" attribute for salutation dropdown
	private WebElement salutationDropdown;

	@FindBy(name = "firstName") // Assume "name" attribute for first name field
	private WebElement firstNameField;

	@FindBy(name = "lastName") // Assume "name" attribute for last name field
	private WebElement lastNameField;

	@FindBy(name = "email") // Assume "name" attribute for email field
	private WebElement emailField;

	@FindBy(name = "contactNumber") // Assume "name" attribute for contact number field
	private WebElement contactNumberField;

	@FindBy(name = "userName") // Assume "name" attribute for username field
	private WebElement userNameField;

	@FindBy(name = "password") // Assume "name" attribute for password field
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']") // Assume XPath for Submit button
	private WebElement submitButton;

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

}
