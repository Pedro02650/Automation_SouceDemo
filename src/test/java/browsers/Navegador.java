package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegador extends Drivers {
	
	public  void openChrome() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LoginPage);
		
		
	}
	
	public  void fecharNavegador() {
		
		driver.quit();
		
		
	}
	
	

}
