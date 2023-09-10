package com.cydeeo.runners;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-reports.html",
        features = "",
        glue = "",
        dryRun = false,
        tags = "",
        publish = true

)
public class CucumberRunner {}
