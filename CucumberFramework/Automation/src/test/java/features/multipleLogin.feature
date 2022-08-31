#Author: Moulali Syed


Feature: login with multiple userIds

Scenario Outline: HomePage default Login
Given User is on Landing page
When User login into application using <Username>  and password <password>
Then HomePage is populated
And Cards are displayed
Examples:
|Username|password|
|user1         |pwd1       |
|user2         |pwd2       |
|user3         |pwd3       |

