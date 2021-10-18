package com.mytestproject.stepdefinition;

import com.mytestproject.helper.pageobject.HomePage;
import com.mytestproject.utility.ObjectRepo;
import cucumber.api.java.en.Given;


public class Home {

      private HomePage hPage = new HomePage(ObjectRepo.driver); ;

    @Given(": Website is launched")
    public void website_is_launched() {
        ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
    }

    }





