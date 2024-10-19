#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login Feature of the Website
  
  As a registered user,
  I want to be able to log in to my account
  So that I can access the Online Products

  Scenario: Successful Login with valid credentials
    Given User is on the Login page
    When I enter a valid username "validUser"
    And I enter a valid password "validPass"
    And I click on the "Login" button
    Then I should be redirected to the products dashboard
    And I should view the products category page
