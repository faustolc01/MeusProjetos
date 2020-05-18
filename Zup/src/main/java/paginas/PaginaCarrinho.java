package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaCarrinho  extends PaginaBase{
	
	public PaginaCarrinho(WebDriver driver) {
		super(driver);		
	}
	
	//WebElements
	private WebElement tituloItemCarrinho = driver.findElement(By.xpath("//li[@class='basket-product']//h2"));
	private WebElement resumoCarrinho = driver.findElement(By.xpath("//div[@class='basket-summary']"));
	
	
	//Metodos
	public void usuarioValidaCarrinho(String itemPesquisado) throws InterruptedException {	
		tituloItemCarrinho.getText().contains(itemPesquisado);
		if(true) {
			System.out.println("=========================================");
			System.out.println("Item adicionado ao carrinho: " + tituloItemCarrinho.getText());
			System.out.println("" + resumoCarrinho.findElement(By.xpath(".//h3")).getText());
			System.out.println("" + resumoCarrinho.findElement(By.xpath(".//ul")).getText());
			System.out.println("" + resumoCarrinho.findElement(By.xpath(".//div[1]")).getText());
			System.out.println("=========================================");
		}	
	} 

}
