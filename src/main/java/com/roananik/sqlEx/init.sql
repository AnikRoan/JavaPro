
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
    FOREIGN KEY(schedule_id) REFERENCES schedule(id) ON DELETE CASCADE,/*зв'язок many-to-many*/
    FOREIGN KEY(lesson_id) REFERENCES lesson(id) ON DELETE CASCADE
     );
