package jdbc.program;
import jdbc.service.*;
import jdbc.model.*;
import java.util.*;

/**
 *  File:   Program.java
 *  Desc:   Main file
 */
public class Program {
    static MySQLMahasiswaService service = new MySQLMahasiswaService();
    
//    im guessing it's like this tbh
    public static void displayAll(){
        List<Mahasiswa> list_of_students = service.getAll();
        
        for(Mahasiswa student : list_of_students){
            System.out.println(student);
        }
    }
    
    public static void main(String[] args) {
        List<Mahasiswa> list_of_students = new ArrayList<>();
        System.out.println("||" + "=".repeat(10) + "||");
        
//        insertion test
        System.out.println("||  Insertion Test  ||");
        
        Mahasiswa studentAdd = new Mahasiswa(5, "Sudarsono");
        service.add(studentAdd);
        System.out.println("Succesful Insertion of: " + studentAdd);
        displayAll();
        
        
    }
    
}
