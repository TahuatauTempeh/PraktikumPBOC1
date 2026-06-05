/**
 *  File:   ExceptionOnArray.java
 *  Desc:   well, that
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exc){
            exc.printStackTrace();
        } finally{
            System.out.println("Clean the code");
        }
    }
}