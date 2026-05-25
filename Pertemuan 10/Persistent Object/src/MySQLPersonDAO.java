/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *  File:   MySQLPersonDAO.java
 *  Desc:   for connecting to MySQL server
 */
public class MySQLPersonDAO implements PersonDAO{
    @Override
    public void savePerson(Person manusia_biasa) throws Exception{
        String name = Person.getName();
        
//        create a connection witht the SQL
        Class.forName("com.mysql.jdbc.Driver");

//        log in to SQL I think
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/PBO",
                "root",
                ""
        );
        
//        MySQL query?
        String query = "insert into person(name) values('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
//        close connection?
        con.close();
    }
}
