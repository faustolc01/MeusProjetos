package suporteTestes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AbrirNavegador {
	
	
	public static WebDriver createChrome() throws MalformedURLException {
		// Abrir o navegador		
		Capabilities chromeCapabilities = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"), chromeCapabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		// Abrir página do portal de comércio online
		driver.get("https://www.americanas.com.br/");
		
		return driver;
		
	}
	
}
