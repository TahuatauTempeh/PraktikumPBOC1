public class Titik {
    // attributes
    float absis;
    float ordinat;

    // methods
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
    }

    public float getAbsis(){
        return this.absis;
    }

    public float getOrdinat(){
        return this.ordinat;
    }

    public void setAbsis(float x){
        this.absis = x;
    }

    public void setOrdinat(float y){
        this.ordinat = y;
    }
    
    public void geserTitik(float x, float y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return  2;
        }
        else if (absis < 0 && ordinat < 0) {
            return  3;
        }
        else if (absis > 0 && ordinat < 0) {
            return  4;
        }
        return  0;
    }

    public float distanceFromOrigin(){
        return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public float distanceFromOther(Titik T){
        return (float) Math.sqrt(Math.pow((T.absis - this.absis), 2) + Math.pow((T.ordinat - this.ordinat), 2));
    }

    // permanently change the value of either x or y
    public void setReflectionToX(){
        this.ordinat = this.ordinat * -1;
    }

    public void setReflectionToY(){
        this.absis = this.absis * -1;
    }

    // only change the value that is outputted in the terminal but not the original value
    public Titik viewReflectionX(){
        Titik T = new Titik();
        
        T.setAbsis(this.getAbsis());
        T.setOrdinat(this.getOrdinat() * -1);
        
        return T;
    }

    public Titik viewReflectionY(){
        Titik T = new Titik();
        
        T.setAbsis(this.getAbsis() * -1);
        T.setOrdinat(this.getOrdinat());
        
        return T;
    }

    @Override
    public String toString(){
        return "(" + this.absis + ", "  + this.ordinat + ")";
    }

}
