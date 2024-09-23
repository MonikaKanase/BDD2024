Feature: Campaign Functinality i.e Advertisement

@sanity1
Scenario: Creation of campaign
Given User is at the campaign page
When User click on create campaign button
And User enters the information
And User clicks on save button
Then Camaign should get created

@regression
Scenario: Scheduling campaign
Given User is at the campaign page
When User click on edit campaign button
And User enters the sending information
And User clicks on save button
Then Camaign should get scheduled

@functional
Scenario: Sent campaign
Given User is at the campaign page
When User click on sent campaign button
Then User should see the sent count
