#language:en

  Feature: I can open page with link to set calendar
    Scenario: As a user I can see link to set calendar
      Given I navigate to Otus main page by 'https://otus.ru/'
      When I open calendar 'https://otus.ru/events/near/'
      Then I can see calendar 'Ссылка на календарь (.ics)'