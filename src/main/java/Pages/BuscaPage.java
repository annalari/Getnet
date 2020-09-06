package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuscaPage {
	WebDriver driver;

	public BuscaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search-trigger")
	public WebElement ICON_SEARCH;

	@FindBy(id = "global-search-input")
	public WebElement INPUT_SEARCH;

	@FindBy(xpath = "//*[contains(@class, 'c-search-box__button')]")
	public WebElement BTN_SEARCH;

	@FindBy(xpath = "//*[contains(@class, 'c-search-page__title--red')]")
	public WebElement TITLE;

	public WebElement LocateByText(String textToLocate) {
		String xpath = "//*[contains(text(),'" + textToLocate + "')]";
		return driver.findElement(By.xpath(xpath));
	}
}
