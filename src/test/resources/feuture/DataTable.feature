Feature: Forms Page Validation 

Background: 

	Given User is logged in and in CRM Home page 
	
Scenario: Create new form 
	When User navigates to Form page 
	And User clicks new 
	And User enters form data 
		|name	|introductionText |completionText|
		|John   | new student	  | Batch 2	     |
	Then User saves the form 
		