Feature: Maths Subtraction

 Scenario: Check Subtraction
   Given Current total is set to 10
   When I subtract 1
   Then Current total is equal to 9
  

Scenario: Check Subtraction with big number
   Given Current total is set to 1000
   When I subtract 1
   Then Current total is equal to 999
  
  
 Scenario: Check Subtraction - Failed case
   Given Current total is set to 10
   When I subtract 1
   Then Current total is equal to 1001
