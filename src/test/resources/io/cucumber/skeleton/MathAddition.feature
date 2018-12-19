Feature: Maths Addition

 Scenario: Check Addition
   Given Current total is set to 0
   When I add 1
   Then Current total is equal to 1
  
 Scenario: Check Addition with a big number
   Given Current total is set to 1
   When I add 1000
   Then Current total is equal to 1001
  
Scenario: Check Addition to a negative number
   Given Current total is set to -1
   When I add 1000
   Then Current total is equal to 999
  
Scenario: Check Addition to a negative number - Failed Case
   Given Current total is set to -10
   When I add 1010
   Then Current total is equal to 999

  Scenario: Check Addition to a negative number
    Given Current total is set to -11
    When I add 1010
    Then Current total is equal to 999

Scenario: Check addition of Decimals
   Given the inputs are two decimals
   When I add them
   Then I except correct result
   

