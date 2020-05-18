package paginas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaResultadoPositivo extends PaginaBase{	
	
	public PaginaResultadoPositivo(WebDriver driver) {
		super(driver);		
	}

	//WebElements
	private WebElement itemBusca = driver.findElement(By.xpath("//h1[@class='h1 page-title']"));
	private WebElement numeroItensEncontrados = driver.findElement(By.xpath("//div[@class='form-group display-sm-inline-block']/span"));
	private List<WebElement> listaItens;
	
	//Metodos
	public PaginaResultadoPositivo validarResultadoExibeProdutosEncontrados(String itemPesquisado) {	
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='h1 page-title']")));
		itemBusca.getText().contains(itemPesquisado);
		System.out.println("=========================================");
		System.out.println("Quantidade de itens encontrados: " + numeroItensEncontrados.getText());	
		System.out.println("=========================================");
		return this;
	}
	
	public PaginaItemEscolhido usuarioEscolheItem(String itemPesquisado) throws InterruptedException {
		Thread.sleep(2000);
		listaItens = driver.findElements(By.xpath("//div[@data-component='productgrid']//div//a//h2"));	
		String itemSelecionado = listaItens.get(1).getText();
		itemSelecionado.contains(itemPesquisado);
		if(true) {
			System.out.println("=========================================");
			System.out.println("Item selecionado: " + itemSelecionado);
			System.out.println("=========================================");
			listaItens.get(1).click();		
			}
		return new PaginaItemEscolhido(driver);
	}
	

}
