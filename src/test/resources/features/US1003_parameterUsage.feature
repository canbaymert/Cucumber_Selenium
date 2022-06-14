Feature: US1003 Parameter Usage


  @parameter @pr2
  Scenario: TC06 User makes a search using parameter on Amazon page
    Given user goes to amazon home page
    And user makes a search for "Java" on Amazon
    And user asserts that the result includes the "Java" on Amazon
    And user closes the page