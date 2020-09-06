package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {

	static WebDriver driver;

	public static WebDriver GetDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Colaborador\\git\\desafioGetnet\\desafioGetnet\\src\\main\\java\\Utils\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}