package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import resources.Elements;

public class Drivers extends Elements {

	public static String platform = "";
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void open() {

		platform = System.getProperty("platform");

		if (platform.equals("local")) {

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
			driver.get(LoginPage);
			driver.manage().window().maximize();

		} else if (platform.equals("ci")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--no-sandbox");

			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--disable-dev-shm-usage");
			driver = new ChromeDriver(chromeOptions);
			driver.get(LoginPage);
			driver.manage().window().maximize();
		} else {
			System.out.println("The platform parameter was not used, see the README");
		}
	}

	public void browserQuit() {
		driver.quit();
	}
}
