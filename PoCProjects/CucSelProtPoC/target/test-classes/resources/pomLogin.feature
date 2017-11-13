@Test
Feature: Login page fields

Scenario: Validate the Web Elements on Login Page
	Given I launch Chrome web browser
	When Access Glide Path Analyzer application at https://gpa.pimco.com/login 
	Then I verify the displayed Web Elements on Login Page


