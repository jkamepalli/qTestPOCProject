Feature: Maths Check

  Scenario: Check Multiplication
    Given Current total is set to 10
    When I multiple by 3
    Then Current total is equal to 30

  Scenario: Check Division
    Given Current total is set to 10
    When I divide by 2
    Then Current total is equal to 5

  