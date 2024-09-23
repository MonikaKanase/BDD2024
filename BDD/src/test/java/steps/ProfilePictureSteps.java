package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePictureSteps {
	@Given("User should be at homepage")
	public void user_should_be_at_homepage() {
		System.out.println("Given Statement");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
		System.out.println("When statement for add button");
	}

	@When("Upload the image")
	public void upload_the_image() {
		System.out.println("When statement for uplod image");
	}

	@Then("Profile should get added")
	public void profile_should_get_added() {
		System.out.println("Then satement for profile get added");
	}

	@When("User clicks on edit link")
	public void user_clicks_on_edit_link() {
		System.out.println("when statement for user click on edit link");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
		System.out.println("Then statement for profile get updated");
	}
	

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
		System.out.println("When Statement for delete profile");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
		System.out.println("Then statement for profile get delete");
	}


}
