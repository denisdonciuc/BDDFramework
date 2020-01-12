Feature: Free Form  Feature 


#Scenario: Test Form creating feature 
#	Given User is on Free CRM Page Form 
#	When User clicks on forms link 
#	Then User click  new button 
#	And User enter Name "QAT Team" 
#	And User enters intro text "Team Member introduction" 
#	And User enter completione text  "Team lunch" 
#	Then User click  save Button 
#	And closes the browser 
	
	
Scenario Outline: Test Form creating feature 
	Given User is on Free CRM Page Form 
	When User clicks on forms link 
	Then User click  new button 
	And User enter Name "<name>" 
	And User enters intro text "<introtext>" 
	And User enter completione text  "<completion>" 
	Then User click  save Button 
	Then closes the browser 
	
	Examples: 
		|name  |introtext |completion |
		|Fahim |Functional|Strong Java|
		|Babur |SDET      |Cucumber   |
		|Jaward|Driver    |Seller     |