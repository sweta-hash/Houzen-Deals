$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/AIvaluation.feature");
formatter.feature({
  "line": 1,
  "name": "AI valuation of properties",
  "description": "",
  "id": "ai-valuation-of-properties",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4092139270,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify if user is able to valuate the property using Zoopla link",
  "description": "",
  "id": "ai-valuation-of-properties;verify-if-user-is-able-to-valuate-the-property-using-zoopla-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    },
    {
      "line": 3,
      "name": "@One"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to AI valuation page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I provide Zoopla link for valuation",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get AI valuation for the property",
  "keyword": "Then "
});
formatter.match({
  "location": "AIvaluation.i_launch_the_application()"
});
formatter.result({
  "duration": 12726923223,
  "status": "passed"
});
formatter.match({
  "location": "AIvaluation.i_go_to_AI_valuation_page()"
});
formatter.result({
  "duration": 848202864,
  "status": "passed"
});
formatter.match({
  "location": "AIvaluation.i_provide_Zoopla_link_for_valuation()"
});
formatter.result({
  "duration": 595557875,
  "status": "passed"
});
formatter.match({
  "location": "AIvaluation.i_should_get_AI_valuation_for_the_property()"
});
formatter.result({
  "duration": 27029450,
  "status": "passed"
});
formatter.after({
  "duration": 530740566,
  "status": "passed"
});
});