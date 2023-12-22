@tag
Feature: Dsalgo Home Page

  @tag1
  Scenario: Dsalgo Home Page
    Given user opens DSalgo page
    When The user clicks the Get started button
    Then User enter DSalgo Home page
    When The user clicks Data Structures drop down
    Then The user should see six different data structure entries in that dropdown
    When The user clicks any of the Get Started buttons below the data structures
    Then It should alert the user with a message "You are not logged in"
    When user clicks sign in
    Then The user should be redirected to Sign in page
    When User clicks Register
    Then The user should be directed to Register form
