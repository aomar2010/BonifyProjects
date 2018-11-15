package my.bonify.de.task2;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import resources.propertiesFile;

/*
 * this class is the main class to run the test  
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".\\features\\MyBonify.feature" }, glue = { "StepDefinition" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:./test-output/cucumber-reports/report.html" }, monochrome = true)
public class Runner {

	@AfterClass
	public static void writeExtentReport() throws InterruptedException {
		Reporter.loadXMLConfig(".\\resources\\extent-config.xml");
		
	}
		

	}


