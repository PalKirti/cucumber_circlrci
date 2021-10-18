package com.mytestproject.interfaces;


import com.mytestproject.configuration.browser.BrowserType;

public interface IconfigReader {
	String getWebsite();
	int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	BrowserType getBrowser();

}
