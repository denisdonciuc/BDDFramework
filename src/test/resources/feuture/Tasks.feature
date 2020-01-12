Feature: Tasks Page functionality Validation 

Background: 
	Given User is logged in and in CRM Home page 
	
Scenario: Create tasks without providing any data 
	When User navigates to tasks page 
	And User clicks New 
	And User saves the task 
	Then it should display error "The field Title is required" 
	
	
Scenario Outline: Create tasks with only required field data 
	When User navigates to tasks page 
	And User clicks New 
	And User enters task title "<title>" 
	And User saves the task 
	Then the title of task should be displayed "<title>" 
	
	Examples: 
		|title			 |
		|Java Programming|
		|Selenium  		 |
		|Cucumber		 |