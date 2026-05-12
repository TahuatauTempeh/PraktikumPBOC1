import java.util.ArrayList;

public class Teman {
    // attributes
    private ArrayList<String> Lnama;    // list of names I guese
    private int nbelm;                  // total elements in the list I think

    // methods
    public Teman(){
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks){
        try {
            return Lnama.get(indeks);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No members yet");

            return null;
        }
    };

    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama){
        Lnama.add(nama);
        nbelm += 1;
    }

    public void delNama(String nama){
        int indexx;

        indexx = Lnama.indexOf(nama);

        Lnama.remove(indexx);

        nbelm -= 1;
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru){
        int indexx;

        indexx = Lnama.indexOf(nama);

        Lnama.set(indexx, namabaru);
    }

    public int countNama(String nama){
        int count = 0;
        
        for (int i = 0; i < nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                count += 1;
            }
        }

        return  count;
    }
}
