package br.com.correios.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.http.ClientConfig;

import java.time.Duration;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}
	public static WebDriver getDriver() {

		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

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
