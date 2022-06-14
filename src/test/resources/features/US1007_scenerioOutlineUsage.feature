# Go to amazon page and search for laptop, java, pen, and apple.
# Assert that the results includes the written words.
  @Amazon @pr1
  Feature: US1007 Scenario Outline Usage

    Scenario Outline: TC12 Search for the given elements on the Amazon

      Given user goes to amazon home page
      And user makes a search for "<keywords>" on Amazon
      And user asserts that the result includes the "<keywordControl>" on Amazon
      And user closes the page

      Examples:
      |keywords     |keywordControl|
      |laptop       |laptop        |
      |java         |java          |
      |pen          |pen           |
      |apple        |apple         |
