Feature: First Selenium Test
  @Feature1 @Feature3
  Scenario Outline: Google Search - <company>
    Given Open Browser
    When  '<company>' is searched
    Then  Search result should be '<company> - Google Search'
    Examples:
      |company    |
      |Mastercard |
      |Uber       |
      |Apple      |
      |Samsung    |
      |Ola        |
      |Flipkart   |

  @Feature3
  Scenario: Google Search - Myntra
    Given Open Browser
    When  'Myntra' is searched
    Then  Search result should be 'Myntra - Google Search'


