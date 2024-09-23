package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundWithScenarioOutlineSteps {
	@Given("User should be at profile page")
	public void user_should_be_at_profile_page() {
		System.out.println("Given Statement");
	}

	@When("User Enter firstname as {string}")
	public void user_enter_firstname_as(String fname) {
		System.out.println("when stateme for firstname:"+fname);
	}

	@When("User Enters LastName as {string}")
	public void user_enters_last_name_as(String lname) {
		System.out.println("When statement for lastname:"+lname);
	}

	@When("User Enters city name as {string}")
	public void user_enters_city_name_as(String City) {
		System.out.println("When Statement for Cityname:"+City);
	}

	@Then("Profile Should get created")
	public void profile_should_get_created() {
		System.out.println("Then Statement");
	}



}
