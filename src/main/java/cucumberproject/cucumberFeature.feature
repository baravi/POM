@login
Feature: Creating a Lead in LeafTap


Background:
Given Open Browser
And Maximize the window
And Set timeout
And Load URL
And Enter UserName as DemoSalesManager 
And Enter Password as crmsfa
And Click on Login
And  Click CRMSFA link
And Click CreateLead link

@Smoke @Sanity
Scenario: Create lead Negative
Given Enter Company as TestLeaf
And Enter FirstName as Test
And Enter LastName as Leaf
When Click on CreateLead link
But Verify created lead failed

@Sanity
Scenario Outline: Create lead Positive

Given  Enter Company as <company>
And Enter FirstName as <firstName>
And Enter LastName as <lastName>
When Click on CreateLead link
Then Verify created lead

Examples: 
|company||firstName||lastName|
|testleaf1||test1||last1|
|testleaf2||test2||last2|



