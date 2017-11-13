$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pomLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login page fields",
  "description": "",
  "id": "login-page-fields",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Validate the Web Elements on Login Page",
  "description": "",
  "id": "login-page-fields;validate-the-web-elements-on-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch Chrome web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Access Glide Path Analyzer application at https://gpa.pimco.com/login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify the displayed Web Elements on Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ClsLoginFeature.i_launch_Chrome_web_browser()"
});
formatter.result({
  "duration": 6319803317,
  "status": "passed"
});
formatter.match({
  "location": "ClsLoginFeature.access_Glide_Path_Analyzer_application_at_https_gpa_pimco_com_login()"
});
formatter.result({
  "duration": 3740601933,
  "status": "passed"
});
formatter.match({
  "location": "ClsLoginFeature.i_verify_the_displayed_Web_Elements_on_Login_Page()"
});
formatter.result({
  "duration": 5268905383,
  "status": "passed"
});
});