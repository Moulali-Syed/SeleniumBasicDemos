/**
 * 
 */
package cucumberOptions;

/**
 * @author MOULALI
 *
 */
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinition",
 				monochrome=true,
				tags = "@RegressionTest", 
				plugin = {
						"pretty", "html:target/cucumber.html", 
						"json:target/cucumber.json", 
						"junit:target/name.xml" })

public class TestRunner {

}

//monochrome = true – this makes the output in console look good


/*
 * CucumberOptions features = "src/test/java/features" ----->represents location
 * of feature files glue = "stepDefinition" -----> represents the stepDefinition
 * file location dryRun = true -----> when we mark it as true this will check
 * for all matching stepDefinitions for each of the line in feature file
 */
