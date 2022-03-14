package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Narendra Powar\\eclipse-workspace\\CucumberNew1\\Feature",glue= {"StepDefinitions"})

public class Runner {

}
