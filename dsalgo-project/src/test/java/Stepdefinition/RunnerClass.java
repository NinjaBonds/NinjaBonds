package Stepdefinition;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features"
,glue={"Stepdefinition"},
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerClass{
	
		 	
	
}