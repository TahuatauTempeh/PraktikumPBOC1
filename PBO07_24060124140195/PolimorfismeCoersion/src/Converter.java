// File         : Converter.java
// Deskripsi    : No 1 file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Converter {
    public static void main(String[] args) {
        // no 1a 
        System.out.println("||  1.a.    ||");

        int value_holder = 65;

        System.out.println("Value holder as integer : " + value_holder);

        char value_as_char = (char) value_holder;
        System.out.println("Value holder as char : " + value_as_char);

        double value_as_real = (double) value_holder;
        System.out.println("Value holder as real : " + value_as_real);

        // no 1b 
        System.out.println("||  1.b.    ||");

        int back_to_int = (int) value_as_real;

        System.out.println("Value holder back to integer : " + back_to_int);

        // no 1c 
        System.out.println("||  1.c.    ||");

        String x = "1234";
        String y = "5678";
        String s = x + y; 
        Integer z = Integer.parseInt(x) + Integer.parseInt(y);

        System.out.println("String s : " + s);
        System.out.println("Integer z : " + z);

        // no 1d 
        System.out.println("||  1.d.    ||");

        String p = "12.34";
        String q = "56.78";
        String r = p + q;
        Double d = Double.parseDouble(p) + Double.parseDouble(q);

        System.out.println("String r : " + r);
        System.out.println("Double d : " + d);

        // no 1e
        System.out.println("||  1.e.    ||");

        Integer a = Integer.valueOf(s);

        System.out.println("Object integer a : " + a);

        // no 1f
        System.out.println("||  1.f.    ||");

        String t = a.toString();
        
        System.out.println("Object string t : " + t);
    }
}