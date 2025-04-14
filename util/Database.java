package util;

import java.sql.*;

/**
 *
 * @author lucas
 */

public class Database {

    public static Connection connect() throws SQLException {
        String dbUrl = "jdbc:postgresql://localhost:5432/cereja";
        String dbUser = "DB_USER";
        String dbPassword = "DB_PASSWORD";

        try {
            return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro na conexão com o banco de dados PostgreSQL.");
        }
    }
}