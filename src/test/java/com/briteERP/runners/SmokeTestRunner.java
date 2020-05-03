package com.briteERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/briteERP/step_definitions",
        features = "src/test/resources",
        dryRun = false,
        strict = false,
        tags = "@smoke_test",
        plugin = {
                "html:target/smoke_test_default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)

public class SmokeTestRunner {

}
