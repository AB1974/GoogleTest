@googleSearch
Feature: Google web page simple test

  Scenario: A scenario
    Given go to url
    When search something in Google Search box
    Then verify today.com in the page
    Then verify title in the page
    And close browser