package sample;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources", glue = {"org.ks.steps"}, plugin = {"pretty", "html:target/cucumber-report.html"},
tags="@API")
public class MainTestRunner {

}
