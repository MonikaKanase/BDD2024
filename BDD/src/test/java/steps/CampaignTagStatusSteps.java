package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignTagStatusSteps {

	@Given("User is at the campaign page")
	public void user_is_at_the_campaign_page() {
		System.out.println("Given statement for Campaign statement");
	}

	@When("User click on create campaign button")
	public void user_click_on_create_campaign_button() {
		System.out.println("When statement for Campaign statement");
	}

	@When("User enters the information")
	public void user_enters_the_information() {
		System.out.println("When statement for Campaign statement");
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
		System.out.println("When statement for Campaign statement");
	}

	@Then("Camaign should get created")
	public void camaign_should_get_created() {
		System.out.println("Then statement for Campaign statement");
	}

	@When("User click on edit campaign button")
	public void user_click_on_edit_campaign_button() {
  System.out.println("When statement for edit Campaign statement");
	}

	@When("User enters the sending information")
	public void user_enters_the_sending_information() {
		System.out.println("When statement for sent information Campaign statement");
	}

	@Then("Camaign should get scheduled")
	public void camaign_should_get_scheduled() {
     System.out.println("Then statement for Campaign statement");
	}

	@When("User click on sent campaign button")
	public void user_click_on_sent_campaign_button() {
		System.out.println("When statement for Campaign statement");
	}

	@Then("User should see the sent count")
	public void user_should_see_the_sent_count() {
		System.out.println("Then statement for Campaign statement");
	}

}
