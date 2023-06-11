package Github;

public abstract class Kue {
    public String nama, jenis;
    public double harga, berat;
    public abstract double hitungHarga();
    
    public String toString(){
        String result = "";
        result += "Nama Kue    :   " + nama + "\n";
        result += "Harga Kue   :   Rp." + harga + "\n";
        result += "Berat Kue   :   " + berat + "\n";
        return result;
    }
}
