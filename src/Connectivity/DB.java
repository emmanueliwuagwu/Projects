package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
public DB() {

}
public static Connection getCon(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Emmanuel", "root", "UPPER4low");
        return con;
    } catch (Exception e) {
        System.out.print(e);
        return null;
    }
}

}




