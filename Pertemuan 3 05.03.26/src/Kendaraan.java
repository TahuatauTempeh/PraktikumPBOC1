// File         : Kendaraan
// Deskripsi    : Well, kendaraan
// NIM / Nama   : 24060124140195
// Tanggal      : 06.03.26

public class Kendaraan {
    // attributes
    private String noPlat;
    private String types;

    // constructor

    // create a Kendaraan object with no parameters
    public Kendaraan(){
        noPlat = "_";
        types = "_";
    }

    // create a Kendaraan object with parameters
    public Kendaraan(String No, String TP){
        if (TP.equals("Mobil") || TP.equals("mobil") || TP.equals("Motor") || TP.equals("motor")) {
            noPlat = No;
            types = TP;   
        }
    }

    // selector

    // returns the NoPlat
    public String getNoPlat(){
        return noPlat;
    }

    // returns the Type of vehicle. there's only two types in this case study i.e. motorcycles and cars
    public String getType(){
        return types;
    }

    // mutator

    // change the value of the NoPlat
    public void setNoPlat(String NP){
        noPlat = NP;
    }

    // change the value of the Type
    public void setType(String TTP){
        if (TTP.equals("Mobil") || TTP.equals("mobil") || TTP.equals("Motor") || TTP.equals("motor")){
            types = TTP;   
        }
    }

    // other method(s)

    // prints each attributes of the Kendaraan to the terminal
    public void printKendaraan(){
        System.out.println("Plat Nomor: " + noPlat);
        System.out.println("Tipe Kendaraan: " + types);
    }
}

