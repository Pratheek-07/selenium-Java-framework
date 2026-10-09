Feature: Application Login

#  Background:
#    Given Verify if browser is open

  @Smoke
  Scenario Outline: Home page login page
    Given User is on login page
    When User login to website using "<username>" and "<password>"
    Then User is logged in and home page is visible
    And All the products are visible
    Examples:
      |username |password|
      |rahulshettyacademy|Learning@830$3mK2|
