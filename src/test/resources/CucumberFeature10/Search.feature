Feature: Amazon search
Scenario Outline: search field functionality test 
Given user on amazon home page
When user enter the item on search field "<iphone>"
And user click on search button
Then user on search page
Examples:
|iphone|
|Qa testing|