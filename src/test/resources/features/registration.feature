Feature: New User Registration on Website
  
  As a new user,
  I want to be able to register myself
  So that I can buy products on the website

@smoke @sanity
  Scenario: Successful Registration of User
    Given User is on the Login Page
    When User Clicks on Registration button
    Then User should see the registration page

@sanity
  Scenario: New User Register
    Given the user is on the registration page
    When the user enters "firstName" in the First Name field
    And the user enters "lastName" in the Last Name field
    And the user enters "emailID" in the Email id field
    And the user enters "phoneNumber" in the Contact Number field
    And the user enters "userName" in the UserName field
    And the user enters "password" in the Password field
    And the user clicks on the Submit button
    Then the form should be submitted successfully
