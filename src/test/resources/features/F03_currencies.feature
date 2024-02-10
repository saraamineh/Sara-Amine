@Regression
Feature: Currencies feature
  @Smoke
  Scenario: User selects Euro as the currency on nopCommerce demo
    Given user is at home page
    When  User clicks the currency drop-down
    And   User selects "Euro" from the drop-down list
    Then  The selected currency should be "Euro"

