Feature: Amazon Search

  Scenario: TC01 user searches for Laptop on Amazon page

    Given user goes to Amazon home page
    Then user makes a search for 'Laptop' keyword
    And user asserts that the result includes the 'Laptop' keyword
    And user closes the page

  Scenario: TC02 user searches for Java on Amazon page
    Given user goes to Amazon home page
    Then user makes a search for 'Java' keyword
    And user asserts that the result includes the 'Java' keyword
    And user closes the page

  Scenario: TC03 user searches for Apple on Amazon page
    When user goes to Amazon home page
    And user makes a search for 'Apple' keyword
    Then user asserts that the result includes the 'Apple' keyword
    And user closes the page