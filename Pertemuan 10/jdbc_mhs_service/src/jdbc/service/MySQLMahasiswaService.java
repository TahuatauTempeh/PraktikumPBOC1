package jdbc.service;
import jdbc.utilities.*;
import jdbc.model.*;
import java.sql.*;
import java.util.*;

/**
 *  File:   MySQLMahasiswaService.java
 *  Desc:   for all the commands related to MySQL
 */
public class MySQLMahasiswaService {
//    attributes
    Connection koneksi = null;
//    methods
    public MySQLMahasiswaService() {
        koneksi = MySQLUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa student){
        try{
            String query_command = "insert into mahasiswa(id, name) values (?, ?)";
            PreparedStatement sta = koneksi.prepareStatement(query_command);
            sta.setInt(1, student.getId());
            sta.setString(2, student.getName());
            sta.executeUpdate();
            System.out.println("Guess what? Successful insert");
        } catch(SQLException sql){
            System.out.println("Guess what? " + sql.getMessage());
        }
    }
    
    public void update(Mahasiswa student){
        try{
            String query_command = "update mahasiswa set name = ? where id = ?";
            PreparedStatement sta = koneksi.prepareStatement(query_command);
            sta.setInt(2, student.getId());
            sta.setString(1, student.getName());
            sta.executeUpdate();
            System.out.println("Guess what? Successful update");
        } catch(SQLException sql){
            System.out.println("Guess what? " + sql.getMessage());
        }
    }
    
    public void delete(int id_student){
        try{
            String query_command = "delete from mahasiswa where id = ?";
            PreparedStatement sta = koneksi.prepareStatement(query_command);
            sta.setInt(1, id_student);
            sta.executeQuery();
            System.out.println("Guess what? Successful deletion");
        } catch(SQLException sql){
            System.out.println("Guess what? " + sql.getMessage());
        }
    } 
    
    public Mahasiswa getByID(int id_student){
        Mahasiswa student = null;
        
        try{
            String query_command = "select * from mahasiswa where id = ?";
            PreparedStatement sta = koneksi.prepareStatement(query_command);
            sta.setInt(1, id_student);
            ResultSet resultant = sta.executeQuery();
            if(resultant.next()){
                student = new Mahasiswa(resultant.getInt("id"), resultant.getString("name"));
            }
        } catch(SQLException sql){
            System.out.println("Guess what?" + sql.getMessage());
        }
        
        return student;
    }
    
//    i think this one is to return all datas?
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> student_list = new ArrayList<>();
        
        try{
            String query_command = "select * from mahasiswa";
            PreparedStatement sta = koneksi.prepareStatement(query_command);
            ResultSet resultant = sta.executeQuery();
            
            while(resultant.next()){
                student_list.add(new Mahasiswa(resultant.getInt("id"), resultant.getString("name")));
            }
        } catch(SQLException sql){
            System.out.println("Guess what?" + sql.getMessage());
        }
        
        return student_list;
    }
}
