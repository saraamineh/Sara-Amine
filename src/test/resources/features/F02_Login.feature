
Feature: Login Feature
  Scenario Outline: user could login with valid email and password
  Given user is at home page
  When user press on login tab
  And enters his valid email "<email>"
  And enters his valid password "<password>"
  And user press on login button
  Then user login to the system successfully
    Examples:
    | email                 | password |
    | ahmed9gamal@gmail.com |  123456  |

  Scenario Outline: user could login with invalid email and password
    Given user is at home page
    When user press on login tab
    And enters his invalid email "<email>"
    And enters his valid password "<password>"
    And user press on login button
    Then user can't login and a message is displayed
    Examples:
      | email                 | password |
      | ahmedgamal@gmail.com |  123456  |