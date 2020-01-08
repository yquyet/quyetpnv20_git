#Feature: Open Account
#
#  Background:
#    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer
#
#  Scenario Outline:  Open Account
#    When I click user select
#    And  I click chose name
#    And  I click submit
#    And  I click chose deposit
#    And  I input deposit as <number>
#    And  I click submit deposit
#
#    Examples:
#    |number |
#    |200    |