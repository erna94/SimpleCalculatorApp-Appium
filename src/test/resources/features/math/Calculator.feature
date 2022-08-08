@android
Feature: Adding Numbers

  Background: Login successfully
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @sample
  Scenario: Choose button Plus function
    When user input first number "3"
    And user choose icon "plus" operator
    And user input second number "3"
    And user click button calculate
    Then the result should be "6"

  @sample
  Scenario: Choose button Minus function
    When user input first number "3"
    And user choose icon "minus" operator
    And user input second number "3"
    And user click button calculate
    Then the result should be "0"

  @sample
  Scenario: Choose button Division function
    When user input first number "3"
    And user choose icon "division" operator
    And user input second number "3"
    And user click button calculate
    Then the result should be "1"

  @sample
  Scenario: Choose button Multiplication function
    When user input first number "3"
    And user choose icon "multiplication" operator
    And user input second number "3"
    And user click button calculate
    Then the result should be "9"

