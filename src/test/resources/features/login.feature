Feature: Login Functionality for Open Cart E-Commerce Website

  As a user of the OpenCart WebSite
  I should be able to login with valid credentials
  and once logged in
  I should be navigated to my dashboard page
  so, I can access my account related features and manage my orders

  Background:
    Given User is on the OpenCart login Page

    Scenario: Successful login with valid credentials
      Given user have entered valid username "automation229088@gmail.com" and password "test@12345"
      When user clicks on login Button
      Then user should be successfully logged in

      Scenario Outline:Login with invalid credentials
        Given user enter invalid "<username>" and "<password>"
        When user clicks on login Button
        Then user should see error message indicating "<error_message>"
        Examples:
        |username|password|error_message|
        |invalid@gmail.com|%%%%fahshgd| Warning: No match for E-Mail Address and/or Password. |
        |abcder           |testingAutomation| Warning: No match for E-Mail Address and/or Password.|
        |helloWorld@gmail.com|abcvvde       | Warning: No match for E-Mail Address and/or Password.|




