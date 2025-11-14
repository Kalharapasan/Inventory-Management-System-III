package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {
    
   public static Connection mycon() {
    Connection con = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imsI", "root", "kalharamax");
        return con;
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println(e);
        return null;
    }
    }

}
