Feature: Login functionality

  As a registered user
  I want to log into the system
  So that I can access restricted content

  Scenario: Successful login
    Given I am on the login page
    When I enter valid username and password
    And I click on login button
    Then I should see the successful login message

  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid username and password
    And I click on login button
    Then I should see an error message