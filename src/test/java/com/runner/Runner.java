package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\rajug\\eclipse-workspace\\New folder\\cucumber\\src\\test\\java\\com\\feature\\Login.feature",
glue = "com.stepDefinition")
public class Runner {

}
