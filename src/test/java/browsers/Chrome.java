package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;

public class Chrome extends Drivers {

	public void openChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1280x1024");
		options.addArguments("--window-size=1280x1024");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(LoginPage);
	}

	public void browserQuit() {
		driver.quit();
	}
}
