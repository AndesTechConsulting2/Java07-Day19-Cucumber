# language:ru
@all
Функция: Тест сумматора

  @preintermediate
    Сценарий: Тест на собеседовании
      Дано два числа 1 и 2
      Если сумма равна 4 то тест пройден
      #Тогда тест пройден

  @preintermediate
    Сценарий: Тест 2 на собеседовании
      Дано два числа 3 и 5 и 2
      Если сумма равна 10
      Тогда тест пройден

  @summa_params
  Структура сценария: Тест 3 на собеседовании
    Дано два числа <a> и <b>
    Если сумма равна <sum> то тест пройден
      #Тогда тест пройден
  Примеры:
    |a|b|sum|
    |1|2|3  |
    |23|4|27|
    |2 |-3|2|
    |10|-2|8|
