package Utils;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
	WebDriver driver;
	WebDriverWait wait;
	FluentWait<WebDriver> fWait;

	public SeleniumUtils(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		fWait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
	}

	protected void AbrirSite(String link) {
		driver.get(link);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(1600);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	protected void Clica(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	protected void PreencheCampo(WebElement element, String texto) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(texto);
	}

	protected String RetornarTexto(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	protected void closeDriver() {
		driver.close();
	}
}
