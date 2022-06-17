@LoginPage
Feature: Incorrect email and password

  Scenario: Login User with incorrect email and password
    Given User is going to home page "http://automationexercise.com"
    Then The user sees to Home page verify
    And The user click to Signup/Login
    And The user is Verify 'Login to your account' is visible
    Given The user is Enter incorrect email address and password
    And The user Click 'login' button
    And The user Verify error 'Your email or password is incorrect!' is visible