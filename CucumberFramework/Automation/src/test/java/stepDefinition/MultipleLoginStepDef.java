package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MultipleLoginStepDef {

	@Given("^User is on landing page of app$")
	public void user_is_on_landing_page_of_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("landingPage");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^HomePage is populated successfully$")
	public void home_page_is_populated_successfully() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("On HomePage");
	}

	@And("^Cards are displayed as they should$")
	public void cards_are_displayed_as_they_should() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards Displayed");
	}
}