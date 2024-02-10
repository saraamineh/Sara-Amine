@Regression
Feature: Slider feature
  @Smoke
  Scenario: Slider is clickable and direct user to a second URL
    Given user is at home page
    When user clicks on Galaxy S22 slider
    Then user is directed to Galaxy s22  page

  Scenario: Slider is clickable and direct user to a first URL
    Given user is at home page
    When user clicks on iphone 14 pro
    Then user is directed to "//demo.nopcommerce.com/iphone-14-pro"
