#language:en

  Feature: check availability form for HR
    Scenario: As a user I can see button for Hr
      Given I navigate to Otus main page by 'https://otus.ru/'
      When When I select page 'Рекрутерам'
      Then I should see button 'Сотрудничать' on 'Рекрутерам
    '

