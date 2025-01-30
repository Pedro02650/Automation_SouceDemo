package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class Metodos extends Drivers {

	public static void escrever(By by, String s) {
		try {
		WebElement element = driver.findElement(by);
		element.sendKeys(s);
		} catch (Exception e) {
			System.err.println("Causa raiz do erro: "+e.getCause());
		}

	}

	public static void clicar(By by) {
		try {
			WebElement element = driver.findElement(by);
			element.click();
		} catch (Exception e) {
			System.err.println("Causa raiz do erro: "+e.getCause());
		}

	}

	public static void ValidElement(By by, String s) {

		String CapturedText = driver.findElement(by).getText();
		assertEquals(s, CapturedText);

	}

	public static void validarElemento(By by) {

		String el = driver.findElement(by).getText();
		assertEquals(by, el);

	}

	public static void CurrentURL(String URL) {

		String UrlCaptured = driver.getCurrentUrl().toString();
		assertEquals(URL, UrlCaptured);

	}

	public static void tirarPrint(String NameTest, String EvidenceName) {

		try {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String filePath = "evidences/" + NameTest + "_" + EvidenceName + ".png";
			File destFile = new File(filePath);
			FileUtils.copyFile(scrFile, destFile);

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static void esperarPorElemento(By elemento, int seg) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seg));
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

		} catch (Exception e) {
			System.err.println("Causa raiz do erro: "+e.getCause());
		}
		
	}

	public static void arrastarCursor(By elemento) {

		WebElement elementoUm = driver.findElement(elemento);
		new Actions(driver).moveToElement(elementoUm).perform();

	}

	public static void scrollthrough(By by) {
		WebElement element = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}
}
