DROP TABLE IF EXISTS departments;

CREATE TABLE departments (
   id                  BIGINT      AUTO_INCREMENT  PRIMARY KEY,
   name                VARCHAR(50) NOT NULL,
   description         VARCHAR(50)
);