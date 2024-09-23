package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
		features= {"src\\test\\resources\\ApplicationTest\\CampaignTagStatus.feature"},
		glue = {"steps","hooks"},
		plugin = {"pretty"},
		tags = "@regression"
		)
public class CampaignTagStatusRunner extends AbstractTestNGCucumberTests {

}
