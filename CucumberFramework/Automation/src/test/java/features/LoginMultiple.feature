Feature: Application Login

  Scenario: Home page default login
    Given User is on landing page of app
    When User login into application with "jin" and password "1234"
    Then HomePage is populated successfully
    And Cards are displayed as they should

  Scenario: Home page default login
    Given User is on landing page of app
    When User login into application with "john" and password "4738"
    Then HomePage is populated successfully
    And Cards are displayed as they should
