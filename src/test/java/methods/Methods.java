package methods;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import drivers.Drivers;

public class Methods extends Drivers {

	public static void write(By by, String s) {
		try {
			WebElement element = driver.findElement(by);
			element.sendKeys(s);
		} catch (Exception e) {
			System.err.println("Root cause of the error: " + e.getCause());
		}

	}

	public static void click(By by) {
		try {
			WebElement element = driver.findElement(by);
			element.click();
		} catch (Exception e) {
			System.err.println("Root cause of the error: " + e.getCause());
		}

	}

	public static void ValidElement(By by, String s) {

		String CapturedText = driver.findElement(by).getText();
		assertEquals(s, CapturedText);

	}

	public static void CurrentURL(String URL) {

		String UrlCaptured = driver.getCurrentUrl().toString();
		assertEquals(URL, UrlCaptured);

	}

	public static void captureScreenshot(String typeEvidence, String nameEvidence) {

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		File evidenceDir = new File("./evidences/" + typeEvidence);
		if (!evidenceDir.exists()) {
			evidenceDir.mkdirs();
		}

		String filePath = evidenceDir + "/" + nameEvidence + "_" + timestamp + ".png";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(filePath);

		try {
			FileUtils.copyFile(scrFile, destFile);
			System.out.println("Screenshot saved successfully at: " + filePath);
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}
	}

	public static void waitForElement(By elemento, int seg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seg));
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

		} catch (Exception e) {
			System.err.println("Root cause of the error: " + e.getCause());
		}

	}

	public static void dragCursor(By elemento) {

		WebElement elementoUm = driver.findElement(elemento);
		new Actions(driver).moveToElement(elementoUm).perform();

	}

	public static void scrollthrough(By by) {
		WebElement element = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void close() {
		driver.quit();
	}
}
