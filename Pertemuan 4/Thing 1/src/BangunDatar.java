
// Deskripsi    : Bangung datar
// NIM / Nama   : 24060124140195
// Tanggal      : -


public class BangunDatar {
    // attributes
    private int jmlSisi;
    private String warna;
    private String border;

    // methods

    // constructors
    // no parameters
    public BangunDatar(){
        
    }

    // with parameters
    public BangunDatar(int number, String colour, String borderr){
        this.jmlSisi = number;
        this.warna = colour;
        this.border = borderr;
    }

    // selectors

    // returns the sisi
    public int getJmlSisi(){
        return this.jmlSisi;
    }

    // returns the warna
    public String getWarna(){
        return this.warna;
    }

    // returns the border
    public String getBorder(){
        return this.border;
    }

    // mutators

    // set the value of jmlsisi to number
    public void setJmlSisi(int number){
        this.jmlSisi = number;
    }

    // set the value of warna to colour
    public void setWarna(String colour){
        this.warna = colour;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // others

    // prints the info of BangunDartr
    public void printInfo(){
        System.out.println("How many sides: " + this.jmlSisi);
        System.out.println("Colour: " + this.warna);
        System.out.println("Border: " + this.border);
    }
}
