@wip
Feature: Library app logoutfeature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  After as a user, ı should be able to logout when ı click the logout Button

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page
  Scenario: Logout as a User
    When User enters username "Employee61"
    And user enters password  "Employee123"
    And user click Login Button
    And User click A Button
    And User click logout Button
    Then User see login Page
