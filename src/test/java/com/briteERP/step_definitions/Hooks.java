package com.briteERP.step_definitions;


import com.briteERP.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

  @Before
    public void setup(Scenario scenario) {
        System.out.println(":::: Starting test automation ::::");
        System.out.println("Browser type :: " + ConfigurationReader.getProperty("browser"));
        System.out.println("Environment :: "+ ConfigurationReader.getProperty("url"));
        System.out.println("Test scenario :: " + scenario.getName());
        Driver.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown(Scenario scenario){
        //how to check if scenario failed
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            //get scenarios output as array byte
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //attach screenshot to the report
            scenario.embed(image,"image/png", scenario.getName());
        }
        System.out.println("Test clean up");
        Driver.closeDriver();
    }
}
