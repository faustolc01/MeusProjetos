package paginas;

import org.openqa.selenium.WebDriver;

public class PaginaInicial extends PaginaBase {
		
	public PaginaInicial(WebDriver driver) {
		super(driver);		
	}

	public PaginaInicial acessaSite() throws InterruptedException {	
		String getCurrentURL = driver.getCurrentUrl();		
		getCurrentURL.contentEquals("https://www.americanas.com.br/");
		System.out.println(getCurrentURL);		
		return this;
	}
}