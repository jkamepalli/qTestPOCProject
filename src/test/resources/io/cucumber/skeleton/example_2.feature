Feature: Maths Check

  Scenario: Check Addition
    Given Current total is set to 0
    When I add 1
    Then Current total is equal to 1

  Scenario: Check Subtraction
    Given Current total is set to 10
    When I subtract 1
    Then Current total is equal to 9

  Scenario: Check Multiplication
    Given Current total is set to 10
    When I multiple by 3
    Then Current total is equal to 30

  Scenario: Check Division
    Given Current total is set to 10
    When I divide by 2
    Then Current total is equal to 5

  Scenario: Check Addition with a big number
    Given Current total is set to 1
    When I add 1000
    Then Current total is equal to 1001
    


