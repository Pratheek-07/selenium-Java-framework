Feature: Problem Statement for Automating JotForm Submission

  Scenario Outline: User overall satisfaction of service
    Given User in on the home page
    When User fills Overall satisfaction rating
    And Selects Satisfied for "<Friendliness>"
    And Selects Neutral for "<Knowledge>"
    And Selects Very satisfied for "<Quickness>"
    And User selected customer service "<ratings>" for future
    And User enters How can we improve our service
    Then User clicks on the Submit button


    Examples:
    |Friendliness | Knowledge | Quickness | ratings |
    | Satisfied | Neutral     | Very Satisfied | Yes |
    #| Very Satisfied | Satisfied | Neutral     | No  |







