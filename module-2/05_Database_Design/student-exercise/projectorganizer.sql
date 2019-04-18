DROP TABLE IF EXISTS employee                   CASCADE;
DROP TABLE IF EXISTS department                 CASCADE;
DROP TABLE IF EXISTS employee_project           CASCADE;
DROP TABLE IF EXISTS project                    CASCADE;
DROP TABLE IF EXISTS job_title                  CASCADE;


CREATE TABLE employee(
employee_id serial NOT NULL,
job_id serial NOT NULL,             -- FK for job_title table
last_name varchar(45),
first_name varchar(45),
gender varchar (6),  
birthday date NOT NULL,
hire_date date NOT NULL, 
department_id serial,               --FK for department table
CONSTRAINT chk_gender CHECK(gender IN ('Male','Female')),     --CONSTRAINT gender CHECK
CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id)

);

CREATE TABLE department(
department_id serial NOT NULL,
name varchar(45),
CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)  
);

CREATE TABLE employee_project (
employee_id serial NOT NULL,
project_id serial NOT NULL,
CONSTRAINT pk_employee_project_employee_id_project_id PRIMARY KEY (employee_id, project_id)
);

CREATE TABLE project (
project_id serial NOT NULL,
name varchar(45),
start_date DATE NOT NULL,
CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE job_title (
job_id serial NOT NULL,
title varchar(45),
CONSTRAINT pk_job_title_job_id PRIMARY KEY (job_id)
);

INSERT INTO job_title (job_id, title) VALUES (1, 'Inspector');
INSERT INTO job_title (job_id, title) VALUES (2, 'Doctor');
INSERT INTO job_title (job_id, title) VALUES (3, 'House Keeping');
INSERT INTO job_title (job_id, title) VALUES (4, 'Consulting Detective');
INSERT INTO job_title (job_id, title) VALUES (5, 'Consulting Criminal');
INSERT INTO job_title (job_id, title) VALUES (6, 'Government Official');

INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Holmes', 'Sherlock', 'Male', 4, 3,'1854-01-06','1881-10-14');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Watson', 'John', 'Male', 2, 3, '1852-07-07','1881-10-14');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Hooper', 'Molly', 'Female', 2, 1, '1858-12-21', '1882-06-12');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Moriarty', 'James', 'Male', 5, 3, '1855-9-14','1893-06-03');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Lestrad', 'G.', 'Male', 1, 2, '1848-5-21', '1881-10-14');
INSERT INTO employee (last_name, first_name, gender, job_id,                birthday, hire_date) VALUES('Hudson', 'Martha', 'Female', 3, '1833-08-27','1882-11-13');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Holmes', 'Mycroft', 'Male', 6, 4,'1852-03-13','1881-02-07');
INSERT INTO employee (last_name, first_name, gender, job_id, department_id, birthday, hire_date) VALUES('Morstan', 'Mary', 'Female', 2, 1,'1856-03-13','1886-06-18');

INSERT INTO department (department_id, name) VALUES(1, 'St Bartholomew Hosptal');
INSERT INTO department (department_id, name) VALUES(2, 'Scotland Yard');
INSERT INTO department (department_id, name) VALUES(3, 'Freelance Work');
INSERT INTO department (department_id, name) VALUES(4, 'Ministry of Defense');

INSERT INTO project (project_id, name, start_date) VALUES (1, 'The Hounds of Baskerville', '1901-08-18' );
INSERT INTO project (project_id, name, start_date) VALUES (2, 'A Study in Scarlet', '1887-11-01');
INSERT INTO project (project_id, name, start_date) VALUES (3, 'A Sign of the Four', '1890-02-11');
INSERT INTO project (project_id, name, start_date) VALUES (4, 'Scandal in Bohemia', '1891-06-23');



ALTER TABLE employee
ADD FOREIGN KEY (job_id)
REFERENCES job_title(job_id);

ALTER TABLE employee
ADD FOREIGN KEY (department_id)
REFERENCES department(department_id);

ALTER TABLE employee_project
ADD FOREIGN KEY (employee_id)
REFERENCES employee (employee_id);

ALTER TABLE employee_project
ADD FOREIGN KEY (project_id)
REFERENCES project (project_id);