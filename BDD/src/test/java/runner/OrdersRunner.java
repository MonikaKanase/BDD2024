package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\ApplicationTest\\Orders.feature"},//path of feature file
		 glue = {"steps"},
		 plugin = {"pretty"}
		)
public class OrdersRunner extends AbstractTestNGCucumberTests {

}
