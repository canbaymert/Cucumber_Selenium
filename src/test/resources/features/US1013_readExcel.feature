Feature: US1013 Read Excel
  @excel @pr1
  Scenario: TC18 user uses the data from an excel file

    Given user prepares the excel file to be read
    Then user prints the element on row 1 , column 2 on the excel file
    And user prints the country with capital "Vienna" on the excel file
    And user asserts that the number of the countries are 190 on the excel file
    And user asserts that the number of the used rows are 191 on the excel file
