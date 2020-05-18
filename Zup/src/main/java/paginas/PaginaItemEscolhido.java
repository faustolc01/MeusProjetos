package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaItemEscolhido extends PaginaBase{
	
	public PaginaItemEscolhido(WebDriver driver) {
		super(driver);		
	}
	//WebElements
	private WebElement tituloItemSelecionado = driver.findElement(By.id("product-name-default"));
	private WebElement btnComprar = driver.findElement(By.id("btn-buy"));
	
	//Metodos
	public PaginaGarantiaExtendida usuarioValidaOitemECalculaOFreteClicaEmComprar(String itemPesquisado) {
		tituloItemSelecionado.getText().contains(itemPesquisado);
		btnComprar.click();
		return new PaginaGarantiaExtendida(driver);	
	}
	
}
