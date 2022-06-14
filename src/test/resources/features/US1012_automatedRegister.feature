Feature: US1012 Automated Register

  @automation
  Scenario: TC17 user should make an automated registration

    Given user goes to "automationUrl"
    And user clicks the sign in button on Automation page
    And user enters an email address to the Email text box on Automation page
    And clicks the create a new account button
    And user enters all personal information
    And user clicks the register button
    Then asserts that the new account is created
    And user closes the page

