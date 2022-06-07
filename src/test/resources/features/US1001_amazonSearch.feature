@amazonSearchAll
Feature: US1001 Amazon Search

  @laptop @laptopAndJava
  Scenario: TC01 user makes a search for laptop on Amazon

    Given user goes to amazon home page
    Then user makes a search for laptop keyword
    And user asserts that the result includes the laptop keyword
    And user closes the page

 @java @laptopAndJava
  Scenario: TC02 user makes a search for java on Amazon
    Given user goes to amazon home page
    Then user makes a search for java keyword
    And user asserts that the result includes the java keyword
    And user closes the page

  @apple
  Scenario: TC03 user makes a search for apple on Amazon
    When user goes to amazon home page
    And user makes a search for apple keyword
    Then user asserts that the result includes the apple keyword
    And user closes the page