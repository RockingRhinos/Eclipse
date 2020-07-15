package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/CreateLead.feature", 
		glue = "steps", monochrome = true /* , dryRun = true, snippets = SnippetType.CAMELCASE */)
public class Runner extends AbstractTestNGCucumberTests{

}
