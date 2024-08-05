@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      |  1    | 12     | 13     |
      |  -1   | 6      | 5     |
      |  2    | 2      | 4      |

  Scenario: calculate square root of division of two numbers
    Given Two input values, 72 and 2
    When I calculate the result of square root of division of two numbers
    Then I expect the result 6

  Scenario Outline: calculate square root of division of two numbers
    Given Two input values, <first> and <second>
    When I calculate the result of square root of division of two numbers
    Then I expect the result <result>
    Examples:
      | first | second | result |
      |  4    | 1      | 2      |
      |  36   | 4      | 3      |
      |  -98  | -2     | 7      |

