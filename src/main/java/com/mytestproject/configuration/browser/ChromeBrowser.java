package com.mytestproject.configuration.browser;

import com.mytestproject.utility.DateTimeHelper;
import com.mytestproject.utility.ResourceHelper;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class ChromeBrowser {

/*	public Capabilities getChromeCapabilities() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--enable-javascript");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, option);
		return chrome;
	}

	public WebDriver getChromeDriver(Capabilities cap) {
		System.setProperty("webdriver.chrome.driver",
				ResourceHelper.getResourcePath("driver/chromedriver.exe"));
		System.setProperty("webdriver.chrome.logfile",
				ResourceHelper.getResourcePath("logs/chromelogs/")
						+ "chromelog" + DateTimeHelper.getCurrentDateTime()
						+ ".log");
	return new ChromeDriver(cap);
	}*/

	public WebDriver getChromeDriver() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--enable-javascript");

		System.setProperty("webdriver.chrome.driver",
				ResourceHelper.getResourcePath("/driver/chromedriver.exe"));
		System.setProperty("webdriver.chrome.logfile",
				ResourceHelper.getResourcePath("/logs/chromelogs/")
						+ "chromelog" + DateTimeHelper.getCurrentDateTime()
						+ ".log");
		WebDriver driver = new ChromeDriver(option);
		return driver;
	}
	
	public WebDriver getChromeDriver(String hubUrl,Capabilities cap) throws MalformedURLException {
		return new RemoteWebDriver(new URL(hubUrl), cap);
	}

}
