# Company-rest-api

Build & Run instructions

1)Clone or download repository
2)Make sure that MySql is installed
3)To create database user insert such commands in MySql command line:
	a)CREATE USER 'db_user'@'localhost' IDENTIFIED BY 'password';
	b)GRANT ALL PRIVILEGES ON * . * TO 'db_user'@'localhost';
	c)FLUSH PRIVILEGES;
4)Make sure that Maven is installed
5)Open command prompt in project folder and insert commands:
	a)To build project insert:
		mvn clean install
	b)To run project insert:
		java -jar target/OsdbTask-0.0.1-SNAPSHOT.jar
6)To read api documentation follow the link http://localhost:8080/swagger-ui.html
