@pr1
Feature: US1002 Run Common Steps with Background

  Background: Common Step
    Given user goes to amazon home page

  Scenario: TC04 Amazon laptop search
    And user makes a search for laptop keyword on Amazon
    Then user asserts that the result includes the laptop keyword on Amazon
    And user closes the page


  Scenario: TC05 Amazon java search
    And user makes a search for java keyword on Amazon
    Then user asserts that the result includes the java keyword on Amazon
    And user closes the page