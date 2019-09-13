Feature: To validate the Scenario Outline Functionality
Scenario Outline: To check Scenario Outline is working fine with Add customer

Background: 
Given When user given with the Guru99 Page
And When clicks on Add customer button


When User Enters all the mandatory fields "<fname>","<lname>","<mailId>","<Address>","<MobileNo>"
And When user clicks on submit button
Then User should be able to see Atleast four times the Browser should launch

Examples:
|fname|lname|mailId|Address|MobileNo|
|Thiru|Arasu|thirunagr8@gmail.com|Chennai|9995855555|
|Prithiv|Thiru|prithi@gmail.com|Chennai|6846545545|
|Magesh|Babu|magesh@gmail.com|Hyderabad|86456465|