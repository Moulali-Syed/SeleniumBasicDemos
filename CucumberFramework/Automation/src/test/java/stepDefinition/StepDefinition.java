package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		// code to user navigate to landing page
		System.out.println("Navigated to landing page");
	}

	@When("^User login into application with username and password$")
	public void user_Login_into_application_with_username_and_password() {
		// code to login
		System.out.println("logged in successfully");
	}

	@Then("^HomePage is populated$")
	public void homePage_is_populated() {
		// code to validate homepage
		System.out.println("Home page loaded");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		// code for card displayed verification
		System.out.println("Cards displayed");
	}

}
