Feature: Login Feature of the Website

As a registered user,
  I want to be able to log in to my account
  So that I can access the Online Products

 Scenario: Successful Login with valid credentials
    When I enter a valid username "validUser"
    And I enter a valid password "validPass"
    And I click on the "Login" button
    Then I should be redirected to the products dashboard
    And I should view the products category page


