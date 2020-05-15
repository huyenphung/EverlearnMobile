Feature: Login

  @order @1
  Scenario: Verify that user able to login succesfully
Given select Login option
When i enter my email
And i select my tenant
And i enter my password
And i submit
Then i login succesful

  