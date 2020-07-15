Feature: LeafTaps CreateLead Module

Scenario Outline: CreateLead Positive Flow

Given Launch the Application
And Maximize it
And Set the Timeouts
And Enter the userName as demosalesmanager
And Enter the Password as crmsfa
And Click on the login button
And Click on the CRMSFA link
And Click on the Leads link
And Click on the Create Lead link
And Enter the Company name as <cName>
And Enter the First name as <fName>
When Enter the Last name as <lName>
Then Click on the Submit button

Examples:
|cName|fName|lName|
|TestLeaf|Sam|Lazarus|
|TestLeaf|Naveen|Elumalai|