package com.provilac.stepDefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.provilac.configuration.Configuration;
import com.provilac.exception.InValidBrowserException;
import com.provilac.keyword.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestBase {

	public static WebDriver driver;

	Configuration con = new Configuration();

	@Before
	public void setUp() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		if (con.getBrowserName().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		} else if (con.getBrowserName().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (con.getBrowserName().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else
			new InValidBrowserException(con.getBrowserName());

		driver.manage().window().maximize();
		driver.get(con.getUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	}

	//@After
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			Keyword keyword= new Keyword();
			keyword.captureScreenShot("/src/main/resources/failedTestCasesScreenshots");
		}
		
		driver.quit();
	}

}
