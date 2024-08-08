Feature: Searching new cars
  
  In order to search new cars
  As a user
  I have to navigate
  
  @car
  Scenario: Finding new cars
    Given user navigates to carwale website
    When user mouseover to new cars
    Then user clicks on find new cars
    And user clicks on toyota car
    And user validates cartitle as toyota cars
    
 
