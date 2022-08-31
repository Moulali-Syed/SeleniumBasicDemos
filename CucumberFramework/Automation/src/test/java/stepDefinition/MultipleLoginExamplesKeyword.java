package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLoginExamplesKeyword {

	@Given("^User is on Landing page$")
	public void user_on_landingPage() {
		System.out.println("Code to reach landingPage");
	}
	
	@When("^User login into application using (.+)  and password (.+)$")
	public void homePage_is_populated(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Then("^HomePage is populated$")
	public void homePage_is_populated() {
		// code to validate homepage
		System.out.println("Home page loaded");
	}


	@Then("^Cards are displayed$")
	public void cards_are_displayed() {
		// code for card displayed verification
		System.out.println("Cards displayed");
	}
}
