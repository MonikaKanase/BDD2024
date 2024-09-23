Feature:SignUp
Scenario Outline:SignUp to the application with different data
Given User is at the signup page
When User enters "<Name>" on form
And User enters "<Age>" inside the form
And User select the "<Gender>"
Then User should get created

Examples:
| Name | Age | Gender |
| Eder | 18  | Male |
| Ron | 22  | Male |
| Diana | 19  | Female |
|Daniel | 25 | Male |