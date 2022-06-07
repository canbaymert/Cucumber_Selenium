Feature: US1003 Parameter Usage


  @parameter
  Scenario: TC06 User makes a search using parameter on Amazon page
    Given user goes to amazon home page
    And user makes a search for "Java"
    And user asserts that the result includes the "Java"
    Then user closes the page