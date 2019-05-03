Feature: Search

Scenario Outline: Search for property using 3 filters
Given User is on the Home page
When user enters "<cityname>" into the search field
And clicks the Search icon
And clicks the More filters button
And selects Exclude Short Sales checkbox
And selects Redfin Listings Only checkbox
And selects Fixer-Uppers Only checkbox
And clicks Apply Filters
And selects the Table button
Then the property with the selected filters should be displayed
Examples:
|cityname|
|New York|