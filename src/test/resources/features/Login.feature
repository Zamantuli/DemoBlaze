Feature: User sign in

  Background: Launch the browser
    Given I open the browser and navigate to the login page

    Scenario: User sign in with valid credentials
        When I enter the "admin" and "admin"
        And I click on the login button
        Then I should see the "Welcome admin" text