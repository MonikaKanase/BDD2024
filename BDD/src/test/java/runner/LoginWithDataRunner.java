package runner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	// we can exceute runner class by using testng and cucumber annotation
	// and this write outside of runner class

	@CucumberOptions(
			
			features = {"C:\\Users\\SWAPNIL\\eclipse-workspace\\BDD\\src\\test\\resources\\ApplicationTest\\LoginWithData.feature"},
			glue = {"steps"}, //step pkg
			publish = true,
			plugin = {"pretty"}
			
	            )
	public class LoginWithDataRunner extends AbstractTestNGCucumberTests 
	{
	}

	
	
	
	
	
	
	
