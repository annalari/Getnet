package StepDefinitions;

import Helper.Helper;
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

	@When("digito {string} e clicar em procurar")
	public void digito_e_clicar_em_procurar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("o sistema apresenta os resultados")
	public void o_sistema_apresenta_os_resultados() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@When("clico no link {string}")
	public void clico_no_link(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verifico se o titulo da modal apresenta a frase {string}")
	public void verifico_se_o_titulo_da_modal_apresenta_a_frase(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
