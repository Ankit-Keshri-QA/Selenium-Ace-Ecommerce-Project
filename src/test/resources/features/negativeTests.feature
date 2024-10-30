Feature: Negative Testing of the website
  
  As a system admin
  I want to validate the negative areas of the website
  So that I can be assure that website is working as per expected

  Scenario: Empty User Credentials on the Login Page
    Given User is on the Sign In Page
    When User clicks on Login button
    Then User should see the "error" message on the "Login Page"

  Scenario: Empty User Credentials on the Registration Page
    Given User is on the Registration Page
    When User clicks on Submit button
    Then User should see the "error" message on the "Register page"
