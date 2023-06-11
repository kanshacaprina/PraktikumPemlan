package Github;

public class KuePesanan extends Kue {
    public double berat;

    public KuePesanan(String n, double b, double h){
        this.nama = n;
        this.berat = b;
        this.harga = h;
        this.jenis = "Kue Pesanan";
    }
    
    public double hitungHarga(){
        harga = berat*harga;
        return harga;
    }
    
    public double getBerat(){
        return berat;
    }
    
    public String toString(){
        String result = super.toString();
        result += "Berat\t : " + berat + "\n";
        result += "Jenis Order : " + jenis + "\n";
        return result;
    }
}

