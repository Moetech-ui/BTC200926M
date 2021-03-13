Feature: login validation 

Background: 

Given open browser 
|chrome|
|firefox|
|ie|
And nevigate to url
Scenario: as a user using valid credatial should logged in 

When user type userid in usertext box 
And user type password in password box
And user click on login button 
Then then user should be in his profile 



Scenario Outline: as a user using invalid credatial should not be log in 


When user type <"userid"> in usertext box
And user type <"password"> in password box
And user click on login button 
Then then user should be in his profile 

Examples:

|userid|password|
|user1|ds2332|
|user2|dsf3|