# language:ru
@all
Функция: Web test

  @maps
    Сценарий: Тест поисковиков
      Дано домены
      |yandex.ru|
      |google.com|
      |search.com|
      |s1.org    |
      Если адреса валидные
      Тогда тест пройден


  Сценарий: Test user login generation
  Дано имя, фамилия, логин
  |name   |sname    |login  |
  |Basil  |TheWolf  |BTHEWOLF|
  |Peter  |TheFirst |PTHEFIRST|



      #Тогда тест пройден
