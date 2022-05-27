@findDealer
Feature: Find the dealers and verify

  Background:
    Given I am on homepage
    When I mouse hover on “buy+sell” tab

  Scenario: Find the dealers and verify the dealers are in list
    When I click Find a Dealer link
    Then I navigate to the car dealers page
    And I should see the dealer names are display on page
      | 3 Point Motors Epping |
      | 4WD Specialist Group  |
      | 5 Star Auto Trade     |
      | 777 Pinoy Auto Sales  |
      | A Cullen & Son        |
      | ALL ABOUT CARS        |
      | AVON VALLEY TOYOTA    |