#Author: Moulali Syed

Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then Check if browser is displayed


	@RegressionTest @SmokeTest @SanityTest
  Scenario: Home page default login
    Given User is on landing page of app
    When User login into application with "tom" and password "1234"
    Then HomePage is populated successfully
    And Cards are displayed as they should

	@RegressionTest
  Scenario: Home page default login
    Given User is on landing page of app
    When User login into application with "jerry" and password "4738"
    Then HomePage is populated successfully
    And Cards are displayed as they should
    
    @RegressionTest @SanityTest
    Scenario: Signup to site
    Given User is on landing page of app
    When User signup with below details
    | tom | mot | tom@mot.com | India | 87453 |
    Then HomePage is populated successfully
    And Cards are displayed as they should
