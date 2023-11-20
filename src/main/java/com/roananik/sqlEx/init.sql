/*Створити таблицю Homework. Ця таблиця складається
  з атрибутів: id, name, description
Для атрибуту ID має бути забезпечене обмеження Primary Key та AutoIncrement

Створити таблицю Lesson. Ця таблиця складається з атрибутів: id, name, updatedAt,
  homework_id (зв'язок one-to-one)
Для атрибуту ID має бути забезпечене обмеження Primary Key та AutoIncrement
Пов'язано з таблицею Homework через Foreign Key

Створити таблицю Schedule. Ця таблиця складається з атрибутів: id, name,
  updatedAt, lessons (зв'язок many-to-many)
Для атрибуту ID має бути забезпечене обмеження Primary Key і AutoIncrement
Зв'язано з таблицею Lesson через Foreign Key

 Перенести ініціалізаційні sql-скрипти у файл initsql
. ! Файл init.sql і є результатом завдання, яке має бути додане як рішення */
CREATE  TABLE IF NOT EXISTS homework(
    id INT Primary Key,
    name VARCHAR(50),
    description  VARCHAR(255)
);

CREATE  TABLE IF NOT EXISTS lesson(
    id INT Primary Key,
    homework_id INT UNIQUE,
    name VARCHAR(50),
    updatedAt  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(homework_id) REFERENCES homework(id) ON DELETE CASCADE/*зв'язок one-to-one*/
    );

CREATE  TABLE IF NOT EXISTS schedule(
  id INT Primary Key,
  name VARCHAR(50),
 updatedAt  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
     );


CREATE  TABLE IF NOT EXISTS schedule_lessons(
    lesson_id INT,
    schedule_id INT,
    PRIMARY KEY(schedule_id,lesson_id),
    FOREIGN KEY(schedule_id) REFERENCES schedule(id) ON DELETE CASCADE,
    FOREIGN KEY(lesson_id) REFERENCES lesson(id) ON DELETE CASCADE
     );
