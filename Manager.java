package inheritance1;
public class Manager extends Pekerja {
    private static String departemen;
    public static String getDepartemen(){
        return departemen;
    }

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int day, int month, int year, int jumlahAnak, String departemen) {
        super(nama, nik, jenisKelamin, menikah, gaji, jumlahAnak, month, day, year);
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen : " + departemen;
    }
}
