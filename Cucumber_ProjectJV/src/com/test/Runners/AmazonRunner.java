package com.test.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		features ="src/Features/login.feature"
		,glue={"com.test.AutomationSteps"}
		,tags ={"@EmailTest"}
		
		)




public class AmazonRunner {

}
