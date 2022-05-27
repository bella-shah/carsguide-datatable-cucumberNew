Feature: Search functionality
  As a user I would like to search for the cars on  cars guide website

  Background:Given I am on homepage
    When I mouse hover on “buy+sell” tab

  @Regression
  Scenario Outline: Search the buy car with model
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make   | model    | location   | price |
      | Kia    | Niro     | QLD - All  | 90000 |
      | BMW    | 2 Series | NSW - All  | 60000 |
      | Audi   | A3       | NSW - All  | 50000 |
      | Honda  | Civic    | NT - North | 35000 |
      | Nissan | Murano   | NSW - All  | 45000 |
      | Audi   | A1       | ACT - All  | 50000 |

  @Regression
  Scenario Outline: Search the used car with model
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make   | model   | location        | price |
      | Nissan | Murano  | NSW - All       | 30000 |
      | Honda  | CR-V    | NSW - Newcastle | 50000 |
      | Honda  | Civic   | ACT - All       | 40000 |
      | Mazda  | CX-3    | QLD - All       | 50000 |
      | Tesla  | Model 3 | NSW - All       | 90000 |
      | Ford   | Focus   | QLD - All       | 45000 |