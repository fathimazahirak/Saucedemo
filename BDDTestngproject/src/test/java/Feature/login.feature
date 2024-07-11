Feature: Login page automation of sauce demo
Scenario: Login successfully with valid credentials
Given User get to the login page
When User enters valid username and password
And Click on login button
Then User is navigated to login page
//And Close the browser