package jdbc.utilities;
import java.sql.*;

/**
 *  File:   MySQLUtility
 *  Desc:   Utilities and stuffs
 */
public class MySQLUtility {
//    attribute?
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");

//                credentials
                String url = "jdbc:mysql://localhost:3306/PBO";
                String user = "root";
                String password = "";
                
//                connect
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null){
                    System.out.println("Connection is successful bruv");
                }
            } catch(ClassNotFoundException cne){
                System.out.println("Can't load the driver" + cne.getMessage());
            } catch(SQLException sqle){
                System.out.println("Can't connect to the server" + sqle.getMessage());
            }
        }
        
        return koneksi;
    }
}
