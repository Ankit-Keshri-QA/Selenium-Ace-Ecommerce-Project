Feature: New User Registration on Website
  
  As a new user,
  I want to be able to register myself
  So that I can buy products on the website

  Scenario: Successful Registration of User
    Given User is on the Registration Page
    When I enter a valid username "validUser"
    And I enter a valid password "validPass"
    And I click on the "Login" button
    Then I should be redirected to the products dashboard
    And I should view the products category page
