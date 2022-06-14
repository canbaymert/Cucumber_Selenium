Feature: US1010 HerokuApp Deletion Test

  @heroku @pr1
  Scenario: TC15 HerokuApp Delete button should work properly
    Given user goes to "herokuAppUrl"
    And clicks on the add element button on herokuApp page
    And user waits for 2 seconds
    Then waits until the delete button is visible on herokuApp page
    And user asserts that the delete button is visible on herokuApp page
    Then user clicks the delete button on herokuApp page
    And user asserts that the delete button is not visible on herokuApp page
    And user closes the page


