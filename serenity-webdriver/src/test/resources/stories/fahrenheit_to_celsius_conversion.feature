Feature: Celsius to Fahrenheit conversion
 
Narrative:
User should be able to convert Celsius degrees to Fahrenheits

Background:
Given the site 'http://www.fahrenheittocelsius.com/' is open

Scenario: convert 35 Celsius
When I enter '35' degrees Celsius
Then I obtain '95' degrees Fahrenheit

Scenario: convert 40 Celsius
When I enter '40' degrees Celsius
Then I obtain '293' degrees Fahrenheit
