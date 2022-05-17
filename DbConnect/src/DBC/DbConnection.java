/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FCFM
 */
public class DbConnection {

public Connection getConnected() throws ClassNotFoundException, SQLException{
     // create our mysql database connection 
        String myDriver = "com.mysql.cj.jdbc.Driver";
        Class.forName(myDriver);
        String myUrl = "jdbc:mysql://localhost:3306/uanl";
        Connection conn = DriverManager.getConnection(myUrl, "root", "Mysql.123");

        return conn;
    }
    
}
