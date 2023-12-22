@tag
Feature: User registeration

  @tag1
  Scenario Outline: Register with all the fields
    Given User want to navigate Register Page
    When I enter <Username> into the username field
    And Enters Password <Password> into the password field
    And Enters Password <confirm Password> into the password field
    And I click on Register button
    Then Account should get created successfully

    Examples: 
      | Username | Password | Confirm Password |
      | Priya    | Priya@12 | Priya@12         |
