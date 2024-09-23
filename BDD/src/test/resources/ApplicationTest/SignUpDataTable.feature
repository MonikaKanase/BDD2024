Feature: SignUpDataTable Functionality
Scenario: Creation of account for a user
Given User should be at registration page
When User enters the  following information 

| Erin | Smith | erinsmith@gmail.com | 9997657876 |
| Robert | White | robertwhite@gmail.com | 8765433298 |

And Click on submit button
Then User gets created 
