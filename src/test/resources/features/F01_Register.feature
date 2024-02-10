@Regression
Feature: Registration feature
  @Smoke
  Scenario Outline: Verify user can register with valid username and email
    Given user is at home page
    When he clicks on register tab
    And chooses his gender "<gender>"
    And enters his first name "<firstName>"
    And enters his last name "<lastName>"
    And chooses his day "<dayOfBirth>"
    And chooses his month "<monthOfBirth>"
    And chooses his year "<yearOfBirth>"
    And enters his email "<email>"
    And clicks on news letter button
    And enters his password "<password>"
    And confirms his password "<password>"
    And clicks on register button
    Then a successful message should be displayed "you are successfully registered"
    And a continue button should be displayed
    Examples:
      |gender|firstName|lastName|dayOfBirth|monthOfBirth|yearOfBirth|email|password|
      | Male |  Ahmed  |  Gamal | 16       | 08         | 1992 | ahmed9gamal@gmail.com | 123456 |
      | Female| Sara    | Amine  | 25       | 06         | 1995 | sara9amine@gmail.com | 654321 |




