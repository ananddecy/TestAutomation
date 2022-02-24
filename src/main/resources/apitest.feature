@API
Feature: API Test

  @tag1
  Scenario: Display and verify Cheapest price for each car type and overall price for all cars
    Given user makes a API call
    Then user gets a successful 200 response
    Then display the cheapest price for each car type
    Then display the cheapest overall price for all cars

    
  @tag2
  Scenario: Grouping Corporate Car Group and display price from low to high
    Given user makes a API call
    Then user gets a successful 200 response
    Then sorting Corporate Car Group from low to high prices 