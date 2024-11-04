@smoke @regression
Feature: User Navigation on the application
  
  As a new user visiting website for the first time,
  I want to be able to view all pages on the website
  So that I can understand the features offered by the website

  Background: 
    Given User user is on the home page or Landing page
    When User clicks on Hamburger menu

  Scenario: User Navigates to Login or Sign in Page
    And User clicks on Sign In Portal link
    Then User should be redirected to the Login page
    And User should view the credentials input fields to login

  Scenario: User Navigates to Registration Page
    And User clicks on Sign In Portal link
    And User clicks on New User button
    Then User should be redirected to the Registration page
    And User should view the input fields to register himself

  Scenario: User Navigates to Online Products page
    And User clicks on Online Products link
    Then User should be redirected to the Products page
    And User should view the shoes list to buy

  Scenario: User Navigates to Contacts Page
    And User clicks on Contact link
    Then User should be redirected to the Contacts page
    And User should view the broken page
