package inheritance1;
import java.time.*;

public class Pekerja extends Manusia {
    private static double gaji;
    private static LocalDate tahunMasuk;
    private static int jumlahAnak;
    
    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int jumlahAnak, int month, int day, int year) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        tahunMasuk = LocalDate.of(year, month, day);
    }
    
    public static double getGaji() {
        return gaji;
    }
    
    public static int getJumlahAnak() {
        return jumlahAnak;
    }
    
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    
    public static double getBonus() {
        LocalDate now = LocalDate.now();
        int selisihTahun = now.getYear() - tahunMasuk.getYear();
        
        if (selisihTahun > 0 && selisihTahun < 5) {
            return 0.05 * gaji;
        } else if (selisihTahun >= 5 && selisihTahun <= 10) {
            return 0.1 * gaji;
        } else if (selisihTahun >= 10) {
            return 0.15 * gaji;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk : " + tahunMasuk + "\nJumlah Anak : " + jumlahAnak + "\nBonus : " + getBonus() + "\nGaji : " + gaji;
    }
}
