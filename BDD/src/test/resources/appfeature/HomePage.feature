Feature:Home Page functionality
Scenario: Validate Title
Given User is at the lading page
Then Page title should contains "Shopping"
//this is edited on git
Scenario: Verify Cart Icon
Given User is at the landing page
Then Cart icon should get display

Scenario: Checkout the deals section
Given User is at the landing page
When User click on summer section deal

Scenario: Login to application
Given User is at the landing page
When User click on sign in button

