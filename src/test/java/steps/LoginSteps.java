package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user navigates to website")
	public void user_navigates_to_website() {
		System.out.println("In given");
	    
	}
	@When("user validates the homepagetitle")
	public void user_validates_the_homepagetitle() {
		System.out.println("In When");
	}
	@Then("user confirmed its pass")
	public void user_confirmed_its_pass() {
		System.out.println("In Then");
	   
	}

}
