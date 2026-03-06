// File         : Kendaraan
// Deskripsi    : Well, kendaraan
// NIM / Nama   : 24060124140195
// Tanggal      : 06.03.26

public class Kendaraan {
    // attributes
    private String noPlat;
    private String types;

    // constructor
    public Kendaraan(){
        noPlat = "_";
        types = "_";
    }

    public Kendaraan(String No, String TP){
        if (TP.equals("Mobil") || TP.equals("mobil") || TP.equals("Motor") || TP.equals("motor")) {
            noPlat = No;
            types = TP;   
        }
    }

    // selector
    public String getNoPlat(){
        return noPlat;
    }

    public String getType(){
        return types;
    }

    // mutator
    public void setNoPlat(String NP){
        noPlat = NP;
    }

    public void setType(String TTP){
        if (TTP.equals("Mobil") || TTP.equals("mobil") || TTP.equals("Motor") || TTP.equals("motor")){
            types = TTP;   
        }
    }

    // other method(s)
    public void printKendaraan(){
        System.out.println("Plat Nomor: " + noPlat);
        System.out.println("Tipe Kendaraan: " + types);
    }
}

