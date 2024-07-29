package br.com.correios.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.http.ClientConfig;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}
	public static WebDriver getDriver() {

		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdriver\\chromedriver");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--disable-extensions");
        	options.addArguments("--clear-cache");
			//options.addArguments("--disable-gpu");
			//options.addArguments("--no-sandbox");
			//options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1300,1000));

		}
		return driver;
	}

	public static void wait_element(){
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
