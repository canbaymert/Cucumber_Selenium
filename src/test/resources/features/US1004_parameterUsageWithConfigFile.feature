Feature: US1004 Parameter Usage with Configuration File

  @Amazon @pr2
  Scenario: TC07 User checks URL with configuration file

    Given user goes to "amazonUrl"
    Then user waits for 5 seconds
    And user asserts that the URL includes the "amazon"
    And user closes the page
