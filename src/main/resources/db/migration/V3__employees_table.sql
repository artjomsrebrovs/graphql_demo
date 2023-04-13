DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
   id                  BIGINT      AUTO_INCREMENT  PRIMARY KEY,
   name                VARCHAR(50) NOT NULL,
   surname             VARCHAR(50) NOT NULL,
   department_id       BIGINT,
   employment_date     DATE,
   active              BOOLEAN,
   position_id         BIGINT,
   foreign key (department_id) references departments(id),
   foreign key (position_id) references positions(id)
);