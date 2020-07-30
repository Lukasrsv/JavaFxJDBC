/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lukas
 */
public class portaConexao {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/javafxjdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "112233";
    private static final boolean USEUSLL = false;

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {

            throw new RuntimeException("ERRO NA CONEXÃO", ex);

        }

    }

    public static void closeConnection(Connection con) throws SQLException {

        if (con != null) {
            con.close();

        }

    }

    public static void closeConnection(Connection con, Statement stmt) throws SQLException {

        if (stmt != null) {
            stmt.close();
         
        }
        closeConnection(con);
    }

    public static void closeConnection(Connection con, Statement stmt, ResultSet rs) throws SQLException {

        if (rs != null) {
            rs.close();

        }
        closeConnection(con, stmt);
    }
    public static void closeConnection( Statement stmt, ResultSet rs) throws SQLException {

        if (rs != null && stmt != null) {
            rs.close();
            stmt.close();
        }
        
    }

}
