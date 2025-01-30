package browsers;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import drivers.Drivers;

public class Edge extends Drivers {

	public void openEdge(String URL) {
		try {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");

			edge = new EdgeDriver(options);
			edge.manage().window().maximize();
			edge.get(URL);
		} catch (Exception e) {
			System.err.println("Causa raiz do erro: " + e.getCause());
		} 
	}

	public void quitEdge() {
		edge.quit();
	}

	public void closeCurrentWindownEdge() {
		edge.close();
	}
}
