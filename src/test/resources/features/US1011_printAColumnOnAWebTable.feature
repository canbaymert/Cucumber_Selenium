Feature: US1011 Print A Column On A Web Table
  @guru @pr2
  Scenario: TC16 user should create and print a list that includes the elements of a column

    Given user goes to "guruUrl"
    And user waits for 2 seconds
    # And user accepts cookies on Guru Page (do it if necessary)
    And user prints all elements on the column "Company" on Guru Page
    And user closes the page
