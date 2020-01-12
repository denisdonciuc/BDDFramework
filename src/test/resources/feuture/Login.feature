Feature: Free CRM Login Feature 

#Scenario: Test login with valid credentials 
#	Given User is on Free CRM Login Page 
#	When title of login page is Cogmento CRM 
#	And User enters valid username and password 
#	And User clicks on login button 
#	Then User is on home page 
#	And close browser


Scenario Outline: Test login with Invalid credentials 
	Given User is on Free CRM Login Page 
	When title of login page is Cogmento CRM 
	And User enters valid username "<username>" and password "<password>" 
	And User clicks on login button 
	Then User is on home page 
	Then close browser 
	
	#	Scenario: Test Email Create
	#	Given User is on Free CRM Login Page 
	#	When title of login page is Cogmento CRM 
	#	And User enters valid username "Fahim" and password "babur123"
	#	And User clicks on login button 
	#	Then User is on home page
	#	Then close browser
	
	Examples: 
		|username           |password   |
		|fahimn12@gmail.com |noorteck123|
		|Babur              |SDET123    |
		|Jaward             |Driver567  |