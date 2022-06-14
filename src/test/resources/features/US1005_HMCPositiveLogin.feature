Feature: US1005 Positive Login Feature Test

  @HMCPositiveLogin
  Scenario: TC08 Positive login test
    Given user goes to "HMCUrl"
    Then user clicks the login button on HMC page
    And user enters a valid username on HMC page
    And user enters a valid password on HMC page
    And user clicks the 2nd login button on HMC page
    Then user asserts that the login process is completed successfully on HMC page
    And user closes the page

