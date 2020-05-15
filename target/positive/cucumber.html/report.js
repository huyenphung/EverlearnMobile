$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 523177035,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that user able to login succesfully",
  "description": "",
  "id": "login;verify-that-user-able-to-login-succesfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@order"
    },
    {
      "line": 3,
      "name": "@1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "select Login option",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i enter my email",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i select my tenant",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i enter my password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i login succesful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTCs.select_Login_option()"
});
formatter.result({
  "duration": 81927928411,
  "status": "passed"
});
formatter.match({
  "location": "LoginTCs.i_enter_my_email()"
});
formatter.result({
  "duration": 36227,
  "status": "passed"
});
formatter.match({
  "location": "LoginTCs.i_select_my_tenant()"
});
formatter.result({
  "duration": 61132,
  "status": "passed"
});
formatter.match({
  "location": "LoginTCs.i_enter_my_password()"
});
formatter.result({
  "duration": 40277,
  "status": "passed"
});
formatter.match({
  "location": "LoginTCs.i_submit()"
});
formatter.result({
  "duration": 60820,
  "status": "passed"
});
formatter.match({
  "location": "LoginTCs.i_login_succesful()"
});
formatter.result({
  "duration": 62815,
  "status": "passed"
});
});