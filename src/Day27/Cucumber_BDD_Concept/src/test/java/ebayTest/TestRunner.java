package ebayTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featuresNew",
                 glue={"ebayTest"},
                 plugin= {"pretty","html:target/htmlreport.html",
		                           "json:target/jsonreport",
		                           "junit:target/junitreport"})
public class TestRunner {
 
}
 