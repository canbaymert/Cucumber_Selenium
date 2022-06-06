@wip
Feature: US1002 User runs common steps with Background

  Background: common step
    Given user goes to Amazon home page

  Scenario: TC04 Amazon 'Laptop' search
    And user makes a search for 'Laptop' keyword
    Then user asserts that the result includes the 'Laptop' keyword
    And user closes the page


  Scenario: TC05 Amazon 'Java' search
    And user makes a search for 'Java' keyword
    Then user asserts that the result includes the 'Java' keyword
    And user closes the page