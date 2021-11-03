 #language: ru

 Функционал: Страхование путешественников

   Сценарий: Заявка на ДМС

     Когда выбран пункт главного меню - "Страхование"
     И выбран объект страхования - "страховые программы"
     И выбрана программа - "Страхование путешественников"

     Тогда заголовок страницы - Страхование путешественников

     Когда нажата кнопка - Оформить онлайн
     И нажата кнопка - Оформить на сайте
     И выбран регион - "Все страны мира, кроме США и РФ"
     И выбрана сумма - "Минимальная"
     И нажата кнопка - Оформить
     И заполняются поля:
       | Фамилия застрахованного       | Ivanov        |
       | Имя застрахованного           | Ivan          |
       | Дата рождения застрахованного | 02.02.1992    |
       | Фамилия                       | Александрова  |
       | Имя                           | Александра    |
       | Отчество                      | Александровна |
       | Дата рождения                 | 01.01.1991    |
       | Пол                           | Женский       |
       | Серия паспорта                | 1111          |
       | Номер паспорта                | 123456        |
       | Дата выдачи паспорта          | 01.09.2020    |
       | Кем выдан паспорт             | ЙЦУК №123     |

     Тогда значения полей равны:
       | Фамилия застрахованного       | Ivanov        |
       | Имя застрахованного           | Ivan          |
       | Дата рождения застрахованного | 02.02.1992    |
       | Фамилия                       | Александрова  |
       | Имя                           | Александра    |
       | Отчество                      | Александровна |
       | Дата рождения                 | 01.01.1991    |
       | Пол                           | Женский       |
       | Серия паспорта                | 1111          |
       | Номер паспорта                | 123456        |
       | Дата выдачи паспорта          | 01.09.2020    |
       | Кем выдан паспорт             | ЙЦУК №123     |

     Когда нажата кнопка - Продолжить

     Тогда появилось уведомление - При заполнении данных произошла ошибка
     И поля содержат ошибки:
     |Мобильный телефон|Поле не заполнено.|
     |Электронная почта|Поле не заполнено.|
     |Повтор электронной почты|Поле не заполнено.|