package sample;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources", glue = {"org.ks.steps"}, plugin = {"pretty", "html:target/cucumber-report.html",
		"json:target/cucumber-jsonreport.json"},
tags="@API")
public class MainTestRunner {

}
