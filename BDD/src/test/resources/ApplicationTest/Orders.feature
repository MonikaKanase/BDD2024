Feature: Order Functionality
Background: 
Given User should be logged into the application
When User should be at the order page 

Scenario: Feteching previously placed order information
When User clicks on past order button
Then User should be able to see the past order information

Scenario: Feteching current placed order information
When User clicks on the current order button
Then User should be able to see the current order information

Scenario: Feteching cancelled order information
When User clicks on cancelled order button
Then User should be able to see the cancelled order information