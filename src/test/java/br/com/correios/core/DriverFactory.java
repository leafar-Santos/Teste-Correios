package br.com.correios.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.http.ClientConfig;

import java.time.Duration;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}
	public static WebDriver getDriver() {

		if (driver == null) {
			ChromeOptions options = new ChromeOptions().setHeadless(true);

			driver = new ChromeDriver(options);
			options.addArguments("--no-sandbox");
			//System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
			//System.setProperty("webdriver.chrome.driver", "/home/rafael/webdriver/chromedriver");
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
