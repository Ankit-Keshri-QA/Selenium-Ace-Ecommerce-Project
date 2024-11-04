
package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", 
    glue = {"stepDefinitions"},	 
    plugin = {
        "pretty", 
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json",
         },
    monochrome = true,
    dryRun =  false,
    tags = "@happyPath"
    
)

public class TestRunner {
	
	
}
