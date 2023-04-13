DROP TABLE IF EXISTS positions;

CREATE TABLE positions (
   id                  BIGINT      AUTO_INCREMENT  PRIMARY KEY,
   name                VARCHAR(50) NOT NULL,
   description         VARCHAR(50),
   base_salary         REAL
);