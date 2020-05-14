$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenario",
  "description": "",
  "id": "registration-functionality-scenario",
  "keyword": "Feature"
});
formatter.before({
  "duration": 296865159,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify the first case",
  "description": "",
  "id": "registration-functionality-scenario;verify-the-first-case",
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
  "comments": [
    {
      "line": 5,
      "value": "# Given I lauch app"
    }
  ],
  "line": 6,
  "name": "i click on preferences",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i click on Preference dependencies",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i check on Wifi",
  "keyword": "And "
});
formatter.match({
  "location": "PreferenceTC.i_click_on_preferences()"
});
formatter.result({
  "duration": 32635976086,
  "status": "passed"
});
formatter.match({
  "location": "PreferenceTC.i_click_on_Preference_dependencies()"
});
formatter.result({
  "duration": 2964949667,
  "status": "passed"
});
formatter.match({
  "location": "PreferenceTC.i_check_on_Wifi()"
});
formatter.result({
  "duration": 3013076706,
  "status": "passed"
});
});