package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="./src/test/resources/CucumberFeature10",
		glue="com.stepdefinitiom"
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
