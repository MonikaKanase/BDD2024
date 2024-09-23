Feature: Profile Functionality.
Scenario: Add profile for a user
Given User should be at homepage
When User clicks on add profile button
And Upload the image
Then Profile should get added


Scenario: Update profile for a user
Given User should be at homepage
When User clicks on edit link
And Upload the image
Then Profile should get updated

Scenario: Delete profile for a user
Given User should be at homepage
When User clicks on delete profile button
Then Profile should get deleted

