Feature: Functional scenario  for get twitter stats api

  Background:
    * url env.baseUrl
    * print env.baseUrl


  @Dev @Test
  Scenario: Calling GET method with wrong path
    Given path '/twitter/trends'
    And header Accept = 'application/json'
    When method GET
    Then status 404
