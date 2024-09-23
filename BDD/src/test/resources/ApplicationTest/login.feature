Feature: login functionality
Scenario: login with valid credentials
Given user is at the login screen
When user enters username
And user enters password
And user clicks on login button
Then user should get logged in

Scenario: Title Verification
Given user is at the landing page
Then Tile of page should be pageTitle

