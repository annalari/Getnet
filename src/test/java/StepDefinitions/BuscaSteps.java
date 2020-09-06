package StepDefinitions;

import Helper.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.driver;

public class BuscaSteps {
	
	Helper helper;
	
	@Given("estou na pagina inicial")
	public void estou_na_pagina_inicial() {
		helper = new Helper(driver.GetDriver());
		helper.AcessarSite("https://site.getnet.com.br/");
	}

	@When("clico no icone de pesquisa")
	public void clico_no_icone_de_pesquisa() {
		helper.ClicarIconePesquisa();
	}

	@And("digito {string}")
	public void digito(String texto) {
	    helper.PreencherCampo(texto);
	}

	@And("clicar em procurar")
	public void clicar_em_procurar() {
	    helper.ClicarProcurar();
	}
	
	@When("o sistema apresenta os resultados {string}")
	public void o_sistema_apresenta_os_resultados(String titulo) {
	    helper.VerificarPesquisa(titulo);
	}


	@And("clico no link {string}")
	public void clico_no_link(String link) {
		helper.ClicarLink(link);
	}

	@Then("Verifico se o titulo da modal apresenta a frase {string}")
	public void verifico_se_o_titulo_da_modal_apresenta_a_frase(String titulo) {
		helper.VerificarTituloModal(titulo);
	}

}
