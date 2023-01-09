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

@Register @two
Scenario: verify whether user is not allowed to register on skipping the mandatory fields
Given I launch the application
And I navigate to account register page
When I click on continue button
Then I should not see the user account is not created
And I should see the error messages informing the user to fill the mandatory fields

@Register @three
Scenario: verify whether user is able to register in to the application by subscribing to news letter
Given I launch the application
And I navigate to account register page
When I provide all the below details
| FirstName | Ravi |
| LastName | Kiran|
|  Email   | ravi.kiran1@gmail.com|
|Telephone | 7795233614 |
|Password  | Crcholas@7 |
And I select the privacy policy
And I subscribe to news letter
And I click on continue button
Then I should see the user account has successfully created



@Register @four
Scenario: verify whether user is restricted from creating a duplicate account
Given I launch the application
And I navigate to account register page
When I provide the duplicate details
| FirstName | Ravi |
| LastName | Kiran|
|  Email   | ravi.kiran1@gmail.com|
|Telephone | 7795233614 |
|Password  | Crcholas@7 |
And I select the privacy policy
And I click on continue button
Then I should see the user is restricted from creating duplicate account
