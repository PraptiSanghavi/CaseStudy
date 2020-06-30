Feature: Registration for New User on TestMeApp portal

  Scenario Outline: 
    User visits TestMeApp portal for registration purpose

    Given The URL of TestMeApp portal is "https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm"
    When User clicks on SignUp link "https://lkmdemoaut.accenture.com/TestMeApp/RegisterUser.htm"
    And User enters Username "<username>" for registration
    And User enters First Name "<fname>" for registration
    And User enters Last Name "<lname>" for registration
    And User enters Password "<password>" for registration
    And User re-enters password "<cpassword>" for registration
    And User clicks Gender "<gender>" radio button for registration
    And User enters Email "<email>" for registration
    And User enters Mobile Number "<number>" for registration
    And User enters Date of Birth "<dob>" for registration
    And User enters Address "<address>" for registration
    And User selects Security Question "<question>" for registration
    And User enters Answer "<answer>" for security question for registration
    And User clicks on Register button
    Then User is directed to TestMeApp Login Page

    Examples: 
      | username | fname | lname   | password | cpassword | gender | email           | number     | dob        | address                                                       | question                  | answer    |
      | Neelu    | Nihar | Panchal | neelu    | neelu     | Male   | nikki@gmail.com | 9712345248 | 09/09/1997 | H-305 Shillalekh Flats, Near Riverfront, Shahibaug, Ahmedabad | What is your Birth Place? | Ahmedabad |
