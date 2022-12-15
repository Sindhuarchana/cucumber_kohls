
Feature: To validate the register functionlaity of kohls Application


Scenario: To validate the kohls url redirection valid credentials

Given The user should be open in kohls homepage
When The user has to click join signin options 

Then message for valid dircetion


Scenario: To Check the invalid email id credential

Given The user has to open kohls homepage

When The user has to click the signin options
And give invalid mail id and click outside the application

Then error message for plz enter valid email

Scenario: To Check the invalid mobile number credential

Given The user has to open kohls homepage

When The user has to click the signin optionss
And give invalid mobilenum and click outside the application

Then error message for plz enter valid mobile num

Scenario: To Check the password and confirmpassword field

Given The user has to open kohls homepages

When The user has to click the signin button
And give correct password and give incorrct password in confirmpasswordfield

Then error message for password do not match



Scenario: To Check the password is given as per the requirement

Given The user has to open kohls homepage url

When The user has to click the signin option
And give incorrect password 

Then error message for invalid password should be displayed

Scenario: To give the valid username and password

Given The user has to open then kohls homepage 

When The user has to click the signin 
And give correct username and  password 

Then redirection should happen to my account page

Scenario: To give the invalid username and password

Given The user has to open then kohls account 

When The user has to open the signin options
And give to the incorrect userid and  pasword 

Then redirection should happen to my account url

Scenario: To validate the kohls url redirection valid link

Given The user should be open in kohls loginpage
When The user has to click join and signin options 

Then message for valid login dircetion

Scenario: To give the invalid username and valid password

Given The user has to open then kohls hmepag 

When The user has to open the signin button
And give to the incorrect userid and  corrct pasword 

Then redirection should happen to login  


Scenario: To give the valid username and invalid password

Given The user has to select then kohls homepage 

When The user has to click the sgnin option
And give to the correct userid and  incorrct pasword 

Then redirection should be done loginpage


Scenario: To check Forgot Password link is present or not

Given The user has to select then kohls homepage1

When The user has to click the sgnin option1
Then check for forget password and validate


Scenario: To check successful regitration

Given The user has to select then kohls homepage suc

When The user has to click the signin options suc
And give details to all input filds
Then check for succesful login


Scenario: To check duplicate login

Given The user has to select then kohls homepage dup

When The user has to click the signin options dup
And give details duplicate values in input filds dup
Then Error thrown for duplicate values


Scenario: mandatory fields check

Given The user has to select then kohls homepage man

When The user has to click the signin options man
And leave some mandatory filds as blank
Then naviation should not happen to dashboard page



