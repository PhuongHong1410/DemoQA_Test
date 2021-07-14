Feature: Webtable
  I want to add member to Webtable element

#  @TC_EL_WT_01
#  Scenario : Verify that data display correct in Grid Member
#    Given Open home page
#    Then The website display Member in Grid correct
#      | Cierra | Vega | 39 | cierra@example.com | 10000 | Insurance |
#    @TC_EL_WT_01
#    Scenario : Verify that data display correct in Grid Member
#      Given Open home page
#      Then The website display default Member in Grid correct
#        | Cierra | Vega | 39 | cierra@example.com | 10000 | Insurance |


#
#  @TC_EL_WT_02
#  Scenario Outline: Verify that open Registration Form success when user click on add button
#    Given Open home page
#    When Click on add button
#    Then The website display Form correct with "<formname>"
#    Examples:
#      | formname          |
#      | Registration Form |

#  @TC_EL_WT_03
#  Scenario: Verify on entering data to all textfield
#    Given Open home page
#    When Click on add button
#    And Enter valid data to all textfield
#      | firstName | lastName | email | age | salary | department |
#      | Phuong | Hong | phuong123@gmail.com | 18 | 2000000 | Tester Team |
#    And Click submit button
#    Then The website display Member in Grid correct
#      | firstName | lastName | age | email |salary | department |
#      | Phuong | Hong | 18 |phuong123@gmail.com |  2000000 | Tester Team  |
#
#  @TC_EL_WT_04
#  Scenario: Verify on entering data to email textfield
#    Given Open home page
#    When Click on add button
#    And Enter valid data to all textfield
#      | Phuong | Hong | phuong123 | 18 | 2000000 | Tester Team |
#    And Click submit button
#    Then The website display warning at email textfield
#
#  @TC_EL_WT_05
#  Scenario: Verify on entering data to age textfield
#    Given Open home page
#    When Click on add button
#    And Enter valid data to all textfield
#      | Phuong | Hong | phuong123@gmail.com | ag | 2000000 | Tester Team |
#    And Click submit button
#    Then The website display warning at age textfield

  @TC_EL_WT_09
  Scenario: Verify on entering data to age textfield
    Given Open home page
    When Click on add button
    And Enter valid data to all textfield
      | firstName | lastName | age | email |  salary |  department |
      | Phuong | Hong |            |phuong123@gmail.com  | 2000000 |  Team |
    And Click submit button
    Then The website display warning at age textfield