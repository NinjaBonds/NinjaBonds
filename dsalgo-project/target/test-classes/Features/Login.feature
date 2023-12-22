@tag
Feature: Sign in Page

  @tag1
  Scenario: Sign in Page
    Given User opens sign in page
    When user clicks sign in link
    Then It should display an error "Please fill out this field." below Username textbox
    When User enters username and password is blank
      | ninjabond |  |
    Then It should display an error "Please fill out this field." below Password textbox
    When User enters invalid username and valid password
      | nin | Ninja@123 |
    Then System should alert user "Please check your user id"
    When User enters valid username and invalid password
      | Ninjabonds | ninja |
    Then System should alert users "Please check your password"
    When user enters a valid id and valid Password
      | Ninjabonds | Ninja@123 |
    Then user enters homepage

  @tag2
  Scenario: Signing in and out
    Given User is in Homepage after Logged in
    When User clicks "sign out"
    Then User enters "sign in" page

  @tag3
  Scenario Outline: User Login with valid "<username>" and "<password>"
    Given The excel file is located at "C:\Users\chand\eclipse-workspace\dsalgo-project\src\test\java\testData\Ds-algosign.xlsx"
    When User enters sheetname "<sheetname>" and rownumber <rowNumber>
    And User clicks on Login button
    Then It should navigate to homepage with a message "you are logged in "

    Examples: 
      | sheetname     | rowNumber |
      | signin        |         0 |
