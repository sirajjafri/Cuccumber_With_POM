Feature: Free CRM login Feature

Scenario: Validate Free CRM login test

Given User opens the browser
Then user is on login page
Then user enter username and password and click Login button
Then home page is displayed
Then validate home page title
Then validate logged in user name
Then close the browser

