package controller;

import model.Book;
import util.Database;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */

public class BookController {

    public static void addBook(Book book) throws SQLException {
        Connection conn = Database.connect();
        String sql = "INSERT INTO books (title, author, publisher, quantity, edition_year, language, isbn) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, book.getTitle());
        stmt.setString(2, book.getAuthor());
        stmt.setString(3, book.getPublisher());
        stmt.setInt(4, book.getQuantity());
        stmt.setInt(5, book.getEditionYear());
        stmt.setString(6, book.getLanguage());
        stmt.setString(7, book.getIsbn());

        stmt.executeUpdate();
        conn.close();
    }


    public static List<Book> getLastThreeBooks() throws SQLException {
        List<Book> list = new ArrayList<>();
        Connection conn = Database.connect();

        String sql = "SELECT * FROM books ORDER BY id DESC LIMIT 3";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Book book = new Book(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getString("publisher"),
                rs.getInt("quantity"),
                rs.getInt("edition_year"),
                rs.getString("language"),
                rs.getString("isbn")
            );
            list.add(book);
        }

        conn.close();
        return list;
    }

}
