package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaResultadoNegativo extends PaginaBase {
	
	
	public PaginaResultadoNegativo(WebDriver driver) {
		super(driver);		
	}

	//WebElements
	private WebElement resultadoNegativo = driver.findElement(By.xpath("//div[@data-tracker='productgrid-main']//span"));
			
	//Metodos
	public PaginaResultadoNegativo validarResultadosProdutoNaoExiste() {
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-tracker='productgrid-main']//span")));				
		return this;
}

	public PaginaInicial usuarioValidaResultadoNegativoERetornaPaginaInicial(String itemPesquisado) throws InterruptedException {		
		resultadoNegativo.getText().contains(itemPesquisado);
		System.out.println("Resultado: " + resultadoNegativo.getText());
		return new PaginaInicial(driver).acessaSite();
	}
	
	
}
