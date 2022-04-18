USE db_tsi;

CREATE TABLE book(
    ID int(11) NOT NULL,
    author varchar(20) NOT NULL,
    name varchar(250) NOT NULL,
    copies float NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO book (ID, author, name, copies) VALUES(1,'Tolkien', 'Lord of Rings', 1500)
INSERT INTO book (ID, author, name, copies) VALUES(2,'J Rowling', 'Harry potter', 1340)
INSERT INTO book (ID, author, name, copies) VALUES(3,'Stan Li', 'Avengers', 2160)