package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//xml,json,html,extend, junit reports
@io.cucumber.junit.CucumberOptions(features="src/test/java/features",glue="stepDefinations",
monochrome=true, tags = "@PlaceOrder or @OffersPage", plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"})
public class JunitTestRunnerTest  {

}
