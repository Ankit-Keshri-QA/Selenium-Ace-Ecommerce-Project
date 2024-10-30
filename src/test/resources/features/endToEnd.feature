Feature: Complete End To End Functionality to Buy a Product
  
  As a registered user,
  I want to login into the website
  and buy a shoe of my type

  Scenario: Successful Login and Purchase
    Given User is on the Home page of the Website
    When User Click on Hamburger Menu
    And User clicks on the Sign in Link
    Then User should be redirected to the Login page
    And User enters the "username" and "password"
    And User clicks on Login button
    Then User should be redirected to the Shoes Page
    And User clicks on one shoe of his type
    Then User should be redirected to the Carts Page
    And User clicks on Add To Cart button
    Then User should be redirected to Confirmation page
    And User should view the success message of purchase
    And User Click on Hamburger Menu
    And User clicks on Home link
    Then User should be redirected to the Home Page again
