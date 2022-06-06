@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella @ikisi
  Scenario: TC01 user makes a search for 'Laptop' on Amazon page

    Given user goes to Amazon home page
    Then user makes a search for 'Laptop' keyword
    And user asserts that the result includes the 'Laptop' keyword
    And user closes the page

 @java @ikisi
  Scenario: TC02 user makes a search for 'Java' on Amazon page
    Given user goes to Amazon home page
    Then user makes a search for 'Java' keyword
    And user asserts that the result includes the 'Java' keyword
    And user closes the page

  @iphone
  Scenario: TC03 user makes a search for 'Apple' on Amazon page
    When user goes to Amazon home page
    And user makes a search for 'Apple' keyword
    Then user asserts that the result includes the 'Apple' keyword
    And user closes the page