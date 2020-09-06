package Helper;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import Pages.BuscaPage;
import Utils.SeleniumUtils;

public class Helper extends SeleniumUtils {
	WebDriver driver;
	BuscaPage buscaPage;

	public Helper(WebDriver driver) {
		super(driver);
		this.driver = driver;
		buscaPage = new BuscaPage(driver);
	}

	public void AcessarSite(String link) {
		AcessarSite(link);
	}

	public void ClicarIconePesquisa() {
		Clica(buscaPage.ICON_SEARCH);
	}

	public void PreencherCampoPesquisar(String msg) {
		PreencheCampo(buscaPage.INPUT_SEARCH, msg);
	}

	public void ClicarProcurar() {
		Clica(buscaPage.BTN_SEARCH);
	}

	public void VerificarPesquisa(String titulo) {
		assertEquals(buscaPage.PAGE_TITLE.getText(), titulo);
	}

	public void ClicarLink(String link) {
		Clica(buscaPage.LocateByText(link));
	}

	public void VerificarTituloModal(String msg) {
		assertEquals(RetornarTexto(buscaPage.LocateByText(msg)), msg);
		closeDriver();
	}
}
