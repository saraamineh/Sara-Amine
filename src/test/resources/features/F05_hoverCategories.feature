@Regression
Feature: Hoover feature
  @Smoke
  Scenario: User hoovers and selects sub-category from the main categories at home page
    Given user is at home page
    When user hoovers on one category
    And selects one sub-category
    Then User is at sub-category page