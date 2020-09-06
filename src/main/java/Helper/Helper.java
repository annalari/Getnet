package Helper;

public class Helper {
	WebDriver driver;
	MainPage mainPage;

	public MainHelper(WebDriver driver) {
		super(driver);
		this.driver = driver;
		mainPage = new MainPage(driver);
	}

	public void AcessarSite(String link) {
		AbrirSite(link);
	}

	public void ClicarIconePesquisa() {
		ClicarBotao(mainPage.ICON_SEARCH);
	}

	public void PreencherCampoPesquisar(String msg) {
		PreencherCampo(mainPage.INPUT_SEARCH, msg);
	}

	public void ClicarProcurar() {
		ClicarBotao(mainPage.BTN_SEARCH);
	}

	public void VerificarPesquisa(String titulo) {
		assertEquals(mainPage.PAGE_TITLE.getText(), titulo);
	}

	public void ClicarLink(String link) {
		ClicarBotao(mainPage.LocatorByText(link));
	}

	public void VerificarTituloModal(String msg) {
		assertEquals(RetornarTexto(mainPage.LocatorByText(msg)), msg);
		FecharDriver();
	}
}
