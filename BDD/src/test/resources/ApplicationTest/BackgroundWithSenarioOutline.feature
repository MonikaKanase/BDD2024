Feature:Profile Feature
Background:
Given User should be at profile page

Scenario Outline: Create profile for user.
When User Enter firstname as "<firstname>"
And User Enters LastName as "<LastName>"
And User Enters city name as "<City>"
Then Profile Should get created

Examples:
|firstname|LastName|City|
|Eder|Majia|Maxo|
|Aron|Seva|Austin|
|Cythia|White|London|