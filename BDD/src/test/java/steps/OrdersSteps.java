package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
		System.out.println("Given Statement for logged into the application ");
	}

	@When("User should be at the order page")
	public void user_should_be_at_the_order_page() {
		System.out.println("When Statement for user at order page");
	}

	@When("User clicks on past order button")
	public void user_clicks_on_past_order_button() {
		System.out.println("When statement for User clicks on past order button ");
	}

	@Then("User should be able to see the past order information")
	public void user_should_be_able_to_see_the_past_order_information() {
	}

	@When("User clicks on the current order button")
	public void user_clicks_on_the_current_order_button() {
		System.out.println("When statement for User clicks on the current order button ");
	}

	@Then("User should be able to see the current order information")
	public void user_should_be_able_to_see_the_current_order_information() {
		System.out.println("Then Statement for User should be able to see the current order information ");
	}

	@When("User clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("When Statement for User clicks on cancelled order button ");
	}

	@Then("User should be able to see the cancelled order information")
	public void user_should_be_able_to_see_the_cancelled_order_information() {
		System.out.println("Then statement for User should be able to see the cancelled order information");
	}}


