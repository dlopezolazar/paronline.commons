/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dlopez
 */
public class DataBaseUtil {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_par", "dlopez", "123456");
        return conn;
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataBaseUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
