package Test1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//run with no.of features, classes
@CucumberOptions(features="/Users/kirankumaryadav/eclipse/selenium/Maven_cucumber/src/test/resources/Test/demo12.feature",
 glue= {"Test1"},
 plugin= {"json:target/cucumber.json"}
)
  
public class TestRunner {

}
