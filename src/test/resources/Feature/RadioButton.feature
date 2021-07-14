Feature: RadioButton
  I want to test radiobutton function on Radio Button element

  @TC_EL_RB_01
  Scenario Outline: Verify that data selected display correct when user click on radio button
    Given Open radio button page
    When Click on [Yes] radio button
    Then The website display the selected value correctly  with "<value>"
    Examples:
      | value |
      | Yes   |