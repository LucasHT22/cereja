CREATE DATABASE cereja;

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255),
	publisher VARCHAR(255),
    quantity INT,
    edition_year INT,
    language VARCHAR(5),
    isbn VARCHAR(20)
);