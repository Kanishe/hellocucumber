#language:en

  Feature: check info about phone and number about Otus company
    Scenario Outline: As a user I can see phone number Otus company
      Given I navigate to Otus main page by 'https://otus.ru/'
      When When I select tab '<tabName>'
      Then I should see '<info>' on '<tabName>' page

      Examples:
      | tabName | info|
      | Контакты| +7 499 938-92-02|
      | Контакты| help@otus.ru    |