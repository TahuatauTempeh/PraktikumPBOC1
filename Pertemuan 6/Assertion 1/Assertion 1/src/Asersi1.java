/**
 *  File:   Asersi1.java
 *  Desc:   Asersi1 file
 */
public class Asersi1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        
        if(x > 0){
            System.out.println("X is a positive number");
        } else{
            assert(x < 0) : "There seems to be an error somewhere bruv";
            System.out.println("X is a negative number");
        }
    }
}