package inheritance1;
public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;
    private double beasiswaA = 50;
    private double beasiswaB = 75;
    
    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public String getNIM() {
        return nim;
    }
    
    public double getIPK() {
        return ipk;
    }

    public double getBeasiswaA(){
        return beasiswaA;
    }

    public double getBeasiswaB(){
        return beasiswaB;
    }
    
    public String getStatus() {
        String[] kata = getNIM().split("");
        
        if ("2".equals(kata[6])) {
            return "\nTeknik Informatika,20" + String.valueOf(kata[0] + kata[1]);
        }
        
        if ("3".equals(kata[6])) {
            return "\nTeknik Komputer,20" + String.valueOf(kata[0] + kata[1]);
        }
        
        if ("4".equals(kata[6])) {
            return "\nSistem Informasi,20" + String.valueOf(kata[0] + kata[1]);
        }
        
        if ("5".equals(kata[6])) {
            return "\nPendidikan Teknologi Informasi,20" + String.valueOf(kata[0] + kata[1]);
        }
        
        if ("6".equals(kata[6])) {
            return "\nTeknologi Informasi,20" + String.valueOf(kata[0] + kata[1]);
        }
        
        return getStatus();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNIM : " + nim + "\nIPK : " + ipk + getStatus();
    }
}
