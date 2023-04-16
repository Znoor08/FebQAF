Feature: Google Search

Scenario Outline: simple search

Given I am on the googlr homepage
When I enter search "<term>"
And I click on google search button 
Then I recive relates search result

Examples:
|term                    |
|Quality Assurance       |
|Software Testing        | 
