package suporteTestes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {
	
	
	public static WebDriver createFirefox() {
		// Abrir o navegador		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Fausto\\Documents\\TestesAutomatizados\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		// Abrir página do portal de comércio online
		driver.get("https://www.americanas.com.br/");
		
		return driver;
		
	}
	
}
