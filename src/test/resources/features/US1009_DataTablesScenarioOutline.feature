Feature: US1009 Data Tables Scenario Outline

  @datatable @pr1
  Scenario Outline: TC14 User should fill the data table

    When user goes to "datatablesUrl"
    Then clicks the New button on Datatables page
    And enters "<firstName>" as a first name on Datatables page
    Then user waits for 1 seconds
    And enters "<lastName>" as a last name on Datatables page
    Then user waits for 1 seconds
    And enters "<position>" as a position on Datatables page
    Then user waits for 1 seconds
    And enters "<office>" as an office on Datatables page
    Then user waits for 1 seconds
    And enters "<extension>" as an extension on Datatables page
    Then user waits for 1 seconds
    And enters "<startDate>" as a startDate on Datatables page
    Then user waits for 1 seconds
    And enters "<salary>" as a salary on Datatables page
    Then user waits for 1 seconds
    And user clicks the create button on Datatables page
    When user makes a search with first name "<firstName>"
    Then user waits for 1 seconds
    Then user asserts that result includes the "<firstName>"
    And user closes the page

    Examples:
    |firstName|lastName|position|office|extension|startDate|salary|
    |Barbara  |Thompson|QA      |Berlin|UI       |2021-10-11|10000|
    |Donald   |Elder   |DEV     |Munich|API      |2022-05-05|11000|
    |Toby     |Lambert |BA      |Berlin|-        |2022-07-10|40000|
    |Jeffrey  |Passmore|PO      |London|-        |2022-03-12|45000|
    |Brandy   |McNary  |DEV     |Izmir |Database |2022-06-06|11000|

