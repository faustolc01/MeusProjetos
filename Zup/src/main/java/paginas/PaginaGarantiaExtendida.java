package paginas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaGarantiaExtendida extends PaginaBase{
	
	public PaginaGarantiaExtendida(WebDriver driver) {
		super(driver);		
	}

	//WebElements
	private List<WebElement> opcoesGarantias;
	WebElement btnContinue = driver.findElement(By.id("btn-continue"));
	
	//Metodos
	public PaginaCarrinho usuarioSelecionaGarantiaEContinuaParaCarrinho() {
		
		opcoesGarantias = driver.findElements(By.xpath("//input/ancestor::label"));	
		System.out.println("=========================================");
		System.out.println("Quantidade de Garantias " + opcoesGarantias.size());
		System.out.println("=========================================");
		opcoesGarantias.get(2).getText().contains("+ 12 meses");
		if(true) {
			System.out.println("=========================================");
			System.out.println("Garantia selecionada: " + opcoesGarantias.get(2).getText());
			System.out.println("=========================================");
			opcoesGarantias.get(2).click();			
			}		
		btnContinue.click();
		return new PaginaCarrinho(driver);
	}
	
}
