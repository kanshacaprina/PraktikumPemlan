package inheritance1;
import static inheritance1.Pekerja.getGaji;

public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return nik;
    }

    public String getMenikah() {
        if (menikah == true) {
            return "Menikah";
        } else {
            return "Belum Menikah";
        }
    }

    public String getJenisKelamin() {
        if (jenisKelamin == true) {
            return "Laki-Laki";
        } else {
            return "Perempuan";
        }
    }

    public double getTunjangan() {
        double tunjangan;
        if (menikah == true) {
            if (jenisKelamin == true) {
                if (Pekerja.getJumlahAnak() != 0) {
                    tunjangan = 25 + (20 * Pekerja.getJumlahAnak());
                } else {
                    tunjangan = 25;
                }
            } else {
                if (Pekerja.getJumlahAnak() != 0) {
                    tunjangan = 20 + (20 * Pekerja.getJumlahAnak());
                } else {
                    tunjangan = 20;
                }
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        if (Manager.getDepartemen() != null) {
            return getTunjangan() + Pekerja.getBonus() + Pekerja.getGaji() + (0.1 * getGaji());
        } else if (Pekerja.getGaji() != 0) {
            return getTunjangan() + Pekerja.getBonus() + Pekerja.getGaji();
        } else {
            return getTunjangan();
        }
    }

    @Override
    public String toString() {
        return "Nama : " + nama + "\nNIK: " + nik + "\nJenis Kelamin : " + getJenisKelamin()
                + "\nStatus Menikah : " + getMenikah() + "\nPendapatan: " + getPendapatan();
    }
}
