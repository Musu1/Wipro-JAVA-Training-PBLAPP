CREATE TABLE emp(id NUMBER(7),last_name VARCHAR2(25), first_name VARCHAR2(25),dept_id NUMBER(7),constraint EMP_ID PRIMARY KEY(id), CONSTRAINT emp_dept_id_FK FOREIGN KEY(DEPT_ID) REFERENCES DEPT (DEPT_ID)); 
Insert into emp(id,last_name,first_name,dept_id) values(101,'Sam','Sundar',10);
Insert into emp(id,last_name,first_name,dept_id) values(102,'Gopi',null,30);
Insert into emp(id,last_name,first_name,dept_id) values(103,null,'ram',20);