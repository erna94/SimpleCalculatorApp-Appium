@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And user do scroll

  @test @positive
  Scenario: Tap multiple function on list view
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    When user double tap in second list
    Then toast should appear twice

