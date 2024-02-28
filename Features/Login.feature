Feature: Login related scenarios

Scenario: Valid login
Given User navigates to application
When User enters valid user name and password
When User clicks on login button
Then System is logged into application