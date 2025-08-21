Feature: validate login page for the ebay site
Scenario Outline: check for valid and invalid credentials
Given login page should be open in the default browser
When click on the username and enter <email>
And click on continue button
And add <password>
And click on signin button check <status>
Then login successfully and then open home page

Examples:

| email | password | status |
| saikarthik573@gmail.com | Kave | failed |
| saikarthik573@gmail.com | kign | failed |
| saikarthik573@gmail.com | kign | failed |
| saikarthik573@gmail.com | Kavali9@ | success |
