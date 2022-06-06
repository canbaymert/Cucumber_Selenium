
Feature: US1003 User makes a search using parameter


  @parameter
  Scenario: TC06 User makes a search using parameter on Amazon page
    Given user goes to Amazon home page
    And user makes a search for 'Java' keyword
    And user asserts that the result includes the "Java" keyword
    Then user closes the page