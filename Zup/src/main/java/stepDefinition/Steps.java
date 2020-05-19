package stepDefinition;

import java.net.MalformedURLException;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.PaginaCarrinho;
import paginas.PaginaInicial;
import paginas.PaginaItemEscolhido;
import paginas.PaginaResultado;
import paginas.PaginaResultadoNegativo;
import paginas.PaginaResultadoPositivo;
import suporteTestes.AbrirNavegador;

public class Steps{
	
	private WebDriver driver;
	
	@Given("^O usuario acessa o site de comercio online$")
	public void abrirNavegadorEacessarOsite() throws InterruptedException, MalformedURLException {
		driver = AbrirNavegador.createChrome();
		new PaginaInicial(driver)
				.acessaSite();			
	}
	
	@When("^O usuario pesquisa por um item: \"(.*?)\"$")
	public void usuarioPesquisaPorItem(String itemPesquisado) throws InterruptedException {
		new PaginaResultado(driver)
				.usuarioPesquisaItem(itemPesquisado)
				.paginaResultado(itemPesquisado);		
	}
	
	@When("^O usuario seleciona o item desejado: \"(.*?)\"$")
	public void usuarioSelecionaOItemDesejado(String itemPesquisado) throws InterruptedException {
		new PaginaResultadoPositivo(driver)			
			.usuarioEscolheItem(itemPesquisado);			
	}
	
	@When("^O usuario adiciona o item \"(.*?)\" no carrinho$")
	public void usuarioAdicionaOItemNoCarrinho(String itemPesquisado) {
		new PaginaItemEscolhido(driver)
			.usuarioValidaOitemECalculaOFreteClicaEmComprar(itemPesquisado)
			.usuarioSelecionaGarantiaEContinuaParaCarrinho();		
	}
	
	@Then("^O usuario valida que o item \"(.*?)\" foi adicionado no carrinho$")
	public void usuarioValidaCarrinho(String itemPesquisado) throws InterruptedException {
		new PaginaCarrinho(driver)
			.usuarioValidaCarrinho(itemPesquisado);			
	}
	
	@Then("^O resultado da pesquisa nao exibe produtos para o item: \"(.*?)\"$")
	public void resultadoPesquisaNaoExibeProdutos(String itemPesquisado) throws InterruptedException {
		new PaginaResultadoNegativo(driver)
			.usuarioValidaResultadoNegativoERetornaPaginaInicial(itemPesquisado);
	}
	
	 @After()
     public void closeBrowser() {
       driver.quit();
     }
		
}
