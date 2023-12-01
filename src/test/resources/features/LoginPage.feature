@RunAll
Feature: Login Page

  @SmokeTest
  Scenario: Verifying login page
    Given   Application login url
    When    User enter name standard_user
    And     User enter password secret_sauce
    And     User click button login
    Then    Home page is presented
