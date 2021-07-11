Feature: Create account and login into economist job portal

  Scenario: User registration
    Given user navigates to the website https://jobs.economist.com/
    When user clicks "Create account" button
    Then user should be navigated to https://jobs.economist.com/register/


   Scenario: Create a New User
    Given user is on https://jobs.economist.com/register/
    And user enters the following details
    | Title            | Mrs.                       |
    | First Name       | Pallavi                    |
    | Last Name        | Patil                      |
    | Email address    | pallavigiddanavar@gmail.com|
    | Password         | Password@1234              |
    | Confirm Password | Password@1234              |
    And user selects "I agree to the Terms & Conditions and Privacy Policy " checkbox
    And user seelcts "I'm not a robot"
    When user clicks "Craete an account" button
    Then new user should be registered successfully with message "Account created"
    Scenario: User does not follow form validations
    When user enters wrong characters
    Then error message displayed with invalid password
    And user returns back on registration page


  Scenario: create account
    Given user navigates to the website https://jobs.economist.com/
    And user logs in through Login Window by using Username as "USER" and Password as "PASSWORD"
    Then login must be successful.


