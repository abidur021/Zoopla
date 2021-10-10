@Smoke
Feature: User able to login with valid username & password
                                                  
Scenario: User login with valid username & verify the page title

Given users can open any browser
And users able to enter "https://www.zoopla.co.uk/" url
When users able to click on the login button
And  users enter the userName "abidur868@gmail.com"
And users enter the  password "1773755Sdi."
And users click on the signing button
Then users able to verify successfully login & verify the homepage title