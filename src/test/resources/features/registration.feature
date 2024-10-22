Feature: New User Registration on Website
  
  As a new user,
  I want to be able to register myself
  So that I can buy products on the website

  Scenario: Successful Registration of User
    Given User is on the Login Page
    When User Clicks on Registration button
    Then User should see the registration page
