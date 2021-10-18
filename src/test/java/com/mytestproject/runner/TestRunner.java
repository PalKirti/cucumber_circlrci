package com.mytestproject.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:featurefile/"},
        glue={"classpath:com.mytestproject.stepdefinition","classpath:com.mytestproject.helper"},
        plugin = { "pretty","html:target/cucumber-reports","json:target/cucumber.json"  },
        tags = "@Test",
        monochrome = true
)

public class TestRunner {


}
