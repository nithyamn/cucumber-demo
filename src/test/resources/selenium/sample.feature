Feature: First Selenium Test
  @Feature2
  Scenario Outline: Google Search - <company>
    Given Open Browser
    When  '<company>' is searched
    Then  Search result should be '<company> - Google Search'
    Examples:
      |company       |
      |BrowserStack  |
      |Worldline     |
      |Amazon        |
      |Vivo          |
      |iBall         |
