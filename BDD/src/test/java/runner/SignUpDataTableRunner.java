package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\ApplicationTest\\SignUpDataTable.feature"},
		glue= {"steps"},
		plugin = {"pretty"}
		)

public class SignUpDataTableRunner extends AbstractTestNGCucumberTests{

}
