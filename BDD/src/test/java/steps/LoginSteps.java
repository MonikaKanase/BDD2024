package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		@Given("user is at the login screen")   // we can define method over here for feature given codition
		public void user_is_at_the_login_screen() 
		{
			System.out.println("Preconditions for given statement");
			
		}
		@When("user enters username")
		public void enteringUsername() 
		{
			System.out.println("Entering Username");
			
		}
		@When("user enters password")
		public void enteringPassword()
		{
			System.out.println("user enters a password");
		}
		@When("user clicks on login button")
		public void clickonLogin() {
			System.out.println("Click on login");
		}
		@Then("user should get logged in")
		public void validatelogin()
		{
			System.out.println("User has been logged in");
		}
		@Given("user is at the landing page")
		public void user_is_at_the_landing_page() {
		System.out.println("Given statement for title verification");
		}

		@Then("Tile of page should be pageTitle")
		public void tile_of_page_should_be_page_title() {
			System.out.println("Then statement for title verification");
		  
		}


		
		
	}


