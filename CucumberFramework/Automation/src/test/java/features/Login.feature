#Author: Moulali Syed

Feature: Application Login

  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username and password
    Then HomePage is populated
    And Cards are displayed
