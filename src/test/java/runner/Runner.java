package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features"
		,glue={"stepdefinations"}
		,plugin= { "html:target/html/cucumber-default-report"}
		,monochrome=true
		)

//glue means here we need to give package name
//which will take all the test cases and execute from their
public class Runner {
	
	
		
	

}
