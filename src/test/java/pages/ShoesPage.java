package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoesPage {

	WebDriver driver;

	public ShoesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Private Locators encapsulated inside the class.

	@FindBy(tagName = "h3")
	private List<WebElement> shoesList;

	@FindBy(xpath = "//*[@id='SmokeTests']/p")
	private WebElement formalShoesText;

	@FindBy(xpath = "//*[@id='RegressionTests']/p")
	private WebElement sportsShoesText;

	@FindBy(xpath = "//*[@id='VanguardTests']/p")
	private WebElement sneakerShoesText;

	@FindBy(css = "button[class*='Formal']")
	private WebElement clickButton;

	// Methods

	public List<String> getProductsName() {
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < shoesList.size(); i++) {
			list.add(shoesList.get(i).getText());
		}

		return list;
	}

	public CartPage goToCartPage() {
		clickButton.click();

		return new CartPage(driver);
	}

}
