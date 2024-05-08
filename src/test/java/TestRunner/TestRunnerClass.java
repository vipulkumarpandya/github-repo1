package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/main/resources/featurefiles", 
					glue = {"stepDefFiles"},
					plugin = {"pretty", "json:target/cucumber.json"},
					monochrome = true,
					publish = true
		)


public class TestRunnerClass extends AbstractTestNGCucumberTests{
	
	@Override 
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		Object[][] cnt = super.scenarios();
		System.out.println("No. of scenarios = " + cnt.length);
		
		return cnt;
	}

}
