Feature: Validate Search Functionality
	Scenario: Search Item on the Application
		Given User is on Main page
		When User enter search item
		And user click on search
		Then User navigate to search result page