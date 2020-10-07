#language:en

Feature: Validate link for invite teacher
  Scenario: As user i can see button to invite teacher
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I select page '<teacher>'
    Then I can click to button invite 'OTUS.RU'