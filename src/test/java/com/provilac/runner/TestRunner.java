package com.provilac.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = "com.provilac.stepDefination", tags = "@invalidreferalCode")
public class TestRunner extends AbstractTestNGCucumberTests {

}
