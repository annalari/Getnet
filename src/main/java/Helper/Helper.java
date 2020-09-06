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
		AbrirSite(link);
	}

	public void ClicarIconePesquisa() {
		Clica(buscaPage.ICON_SEARCH);
	}

	public void PreencherCampo(String texto) {
		PreencheCampo(buscaPage.INPUT_SEARCH, texto);
	}

	public void ClicarProcurar() {
		Clica(buscaPage.BTN_SEARCH);
	}

	public void VerificarPesquisa(String titulo) {
		assertEquals(buscaPage.TITLE.getText(), titulo);
	}

	public void ClicarLink(String link) {
		Clica(buscaPage.TITLE);
	}

	public void VerificarTituloModal(String titulo) {
		assertEquals(RetornarTexto(buscaPage.LocateByText(titulo)), titulo);
		closeDriver();
	}
}
