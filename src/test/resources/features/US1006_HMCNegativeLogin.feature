# Create 3 different negative login scenarios
# 1- valid username- invalid password
# 2- invalid username- valid password
# 3- invalid username- invalid password
 @HMCnegativeLogin @pr2
  Feature: US1006 Negative Login Feature Test
    Background: Common Step
    Given user goes to "HMCUrl"

    Scenario: TC09 Invalid password negative login test
      Then user clicks the login button on HMC page
      And user enters a valid username on HMC page
      And user enters an invalid password on HMC page
      And user clicks the 2nd login button on HMC page
      Then user asserts that the login process is failed on HMC page
      And user closes the page


    Scenario: TC10 Invalid username negative login test
      Then user clicks the login button on HMC page
      And user enters an invalid username on HMC page
      And user enters a valid password on HMC page
      And user clicks the 2nd login button on HMC page
      Then user asserts that the login process is failed on HMC page
      And user closes the page

    Scenario: TC11 Invalid username and invalid password negative login test
      Then user clicks the login button on HMC page
      And user enters an invalid username on HMC page
      And user enters an invalid password on HMC page
      And user clicks the 2nd login button on HMC page
      Then user asserts that the login process is failed on HMC page
      And user closes the page