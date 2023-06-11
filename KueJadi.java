package Github;

public class KueJadi extends Kue {
    public double jumlah;

    public KueJadi(String n, double j, double h){
        this.nama = n;
        this.jumlah = j;
        this.harga = h;
        this.jenis = "Kue Jadi";
    }
    
    public double hitungHarga(){
        harga = harga*jumlah*2;
        return harga;
    }
    
    public double getJumlah(){
        return jumlah;
    }
    
    public String toString(){
        String result = super.toString();
        result += "Jumlah\t : " + jumlah + "\n";
        result += "Jenis Order : " + jenis + "\n";
        return result;
    }
}
