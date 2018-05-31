$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Automation/CuccumberProjectthroughPOM/src/main/java/Features/Freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM login test",
  "description": "",
  "id": "free-crm-login-feature;validate-free-crm-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password and click Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate logged in user name",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDefinition.user_opens_the_browser()"
});
formatter.result({
  "duration": 10741507744,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 5094687878,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.user_enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 6899173249,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.home_page_is_displayed()"
});
formatter.result({
  "duration": 18475070,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.validate_home_page_title()"
});
formatter.result({
  "duration": 9439561,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.validate_logged_in_user_name()"
});
formatter.result({
  "duration": 144385521,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 701980968,
  "status": "passed"
});
});