package com.mytestproject.helper.pageobject;

import com.mytestproject.helper.javascript.JavaScriptHelper;
import com.mytestproject.helper.logger.LoggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends PageBase{

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(HomePage.class);
     JavaScriptHelper javascripthelper;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }




}
