package browsers;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.Drivers;

public class Edge extends Drivers {

	public void openEdge(String URL) {
		try {
			edge = new EdgeDriver();
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
