package br.com.correios.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}
	public static WebDriver getDriver() {

		if (driver == null) {
			ChromeOptions options = new ChromeOptions().setHeadless(true);
			driver = new ChromeDriver(options);

			System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
			options.addArguments("--headless=new"); //should be enabled for Jenkins
			options.addArguments("--no-sandbox");//should be enabled for Jenkins
			options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
			driver.manage().window().setSize(new Dimension(1200,765));

		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
