Feature: AI valuation of properties

	@Register @One	
	Scenario: Verify if user is able to valuate the property using Zoopla link
		Given I launch the application 
		And I go to AI valuation page
		When I provide Zoopla link for valuation
		Then I should get AI valuation for the property
		
	