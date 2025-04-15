<div align="center">
<br />
<img src="https://hc-cdn.hel1.your-objectstorage.com/s/v3/10dedacab6330ebbc66a11f5963741bb4e77b0cf_screenshot-rocks.png">
<h1>Cereja</h1><i>v1.0</i>
<p>The Library Service</p>
</div>

## What's Cereja?

Cereja is a Library System, I started designing Cereja when I realized that I have a lot of books scattered around my house, as a great student of Systems Development why not make a database? So in this v1.0, I present a JFrame Form connected to PostgreSQL.
<br />
Where does the name come from? Cereja is cherry in Portuguese, and I particularly like cherry.

## Requirements to run locally

- Apache NetBeans IDE 21 (or higher)
- PostgreSQL JDBC
- JDK 21 (or higher)
- PostgreSQL 17

### Setting up Database

Create database
```
CREATE DATABASE cereja;
```

Create table
```
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
```

## File Structure

Each one of these folders represent a package.

- `/model`- Contains Book.java, responsible for the get and set methods
- `/controller` - Contains BookController.java, responsible for database requests
- `/util` - Contains Database.java, responsible for connecting to the database, DO NOT forget to set `DB_USER`and `DB_PASSWORD`
- `/view` - Contains MainFrame.java, a JFrame Form, responsible for the user interface
