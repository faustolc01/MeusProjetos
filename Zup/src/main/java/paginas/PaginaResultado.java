package paginas;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PaginaResultado extends PaginaBase  {
	
	
	public PaginaResultado(WebDriver driver) {
		super(driver);		
	}

	//WebElements

	//Metodos	
	
	public PaginaResultado usuarioPesquisaItem(String itemPesquisado) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("h_search-input")));
		driver.findElement(By.id("h_search-input")).clear();
		driver.findElement(By.id("h_search-input")).sendKeys(itemPesquisado);		
		driver.findElement(By.id("h_search-btn")).click();	
		Thread.sleep(2000);
		return this;
	}
	
	public void paginaResultado(String itemPesquisado) throws InterruptedException {		
		try {
			if(driver.findElement(By.xpath("//h1[@class='h1 page-title']")).isDisplayed()) {			
				new PaginaResultadoPositivo(driver).validarResultadoExibeProdutosEncontrados(itemPesquisado);
			}		
		}catch(NoSuchElementException e)
			{
				new PaginaResultadoNegativo(driver).validarResultadosProdutoNaoExiste();
			}
		}


}
