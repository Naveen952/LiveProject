Feature: Registration functionality scenario

@Register @one
Scenario: verify whether user is able to register in to the application by providing all details
Given I launch the application
And I navigate to account register page
When I provide all the below details
| FirstName | Ravi |
| LastName | Kiran|
|  Email   | ravi.kiran1@gmail.com|
|Telephone | 7795233614 |
|Password  | Crcholas@7 |
And I select the privacy policy
And I click on continue button
Then I should see the user account has successfully created
