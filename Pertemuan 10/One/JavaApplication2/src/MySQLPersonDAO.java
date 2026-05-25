
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Akka
 */

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person peepo) throws Exception{
        String name_of_person = peepo.getName();

        // create a connection?
        Class.forName("com.mysql.jdbc.Driver");

        // setup connection apparently?
        Connection connectionnn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/PBO", "root", ""
        );

        // mysql query?
        String query_save = "insert into person(name) values('"+name_of_person+"');";
        System.out.println(query_save);

        Statement ss = connectionnn.createStatement();

        ss.executeUpdate(query_save);

        connectionnn.close();
    }
}
