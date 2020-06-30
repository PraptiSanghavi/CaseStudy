Feature: 
  Login of already registered user on TestMeApp portal

  Scenario Outline: 
    Registered user logs into TestMeApp portal

    Given The URL of TestMeApp portal is "https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm"
    When User clicks on SignIn link "https://lkmdemoaut.accenture.com/TestMeApp/login.htm"
    And User provides valid Username "<username>" and Password "<password>" as credentials
    And User clicks on Login button
    Then User is able to see SignOut link

    Examples: 
      | username | password |
      | Neelu    | neelu    |
