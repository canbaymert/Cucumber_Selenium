Feature: US1008 HMC Negative Login Scenario Outline
  @HMCNegativeScenarioOutline @pr2
  Scenario Outline: TC13 HMC negative login tests

    Given user goes to "HMCUrl"
    Then user clicks the login button on HMC page
    And user enters an invalid "<username>" username on HMC page
    And user enters an invalid "<password>" password on HMC page
    And user clicks the 2nd login button on HMC page
    Then user asserts that the login process is failed on HMC page
    And user closes the page

    Examples:
    |username|password |
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|