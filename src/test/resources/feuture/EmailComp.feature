Feature: Free CRM EmailComp Feature 


Scenario: Test Email Create 
	Given User is on Free CRM Page 
	And User clicks on compaings link 
	And User clicks on Tamplete  Button 
	Then User clicks  new content templete 
	And User enters Name "Rajesh" 
	And User enters Subject "Code Reviw" 
	And User enters email body  "Skype meeting" 
	Then User clicks  save Button 
	