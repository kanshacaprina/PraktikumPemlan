package Github;

import java.util.*;
public class Main {
  public static void main(String[] args) {

    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Rayhan Priambodo", "Teknik Informatika", false));
    // Lakukan modifikasi data tambah mahasiswa ...
    // DataMahasiswa.tambahMahasiswa(new Mahasiswa("Kansha Caprina", "Sistem Informasi", false));
    // DataMahasiswa.tambahMahasiswa(new Mahasiswa("Kansha Partridge", "Sistem Informasi", true));

    Scanner in = new Scanner(System.in);
    int inputan = 0;
    while(inputan != 5){
    System.out.println("==== SIAM FILKOM MENU ====");
    System.out.println("1. Tampil seluruh data Mahasiswa");
    System.out.println("2. Cari Mahasiswa");
    System.out.println("3. Tampilkan data personal Mahasiswa");
    System.out.println("4. Update data Mahasiswa");
    System.out.println("5. Keluar");
    System.out.print("Pilih menu yang diinginkan: ");
    inputan = in.nextInt();
    System.out.println("");

    switch(inputan){
    case 1:
        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();
        break;
    case 2:
        // Method cariMahasiswa (jika data ada)
        // Method cariMahasiswa (jika data tidak ada)
        System.out.print("Masukkan nama Mahasiswa: ");
        in.nextLine();
        String namaMahasiswa = in.nextLine();
        Mahasiswa mahasiswa1 = DataMahasiswa.cariMahasiswa(namaMahasiswa);
        if(mahasiswa1 != null){
            System.out.println("Data mahasiswa atas nama " + namaMahasiswa + " ditemukan\n");
            break;
        }
        else{
            System.out.println("Data mahasiswa atas nama " + namaMahasiswa + " tidak ditemukan\n");
            break;
        }
    case 3:
        // Method tampilMahasiswa (sebelum diupdate)
        System.out.print("Masukkan nama Mahasiswa: ");
        in.nextLine();
        String namaMahasiswa2 = in.nextLine();
        Mahasiswa mahasiswa2 = DataMahasiswa.cariMahasiswa(namaMahasiswa2);
        if(mahasiswa2 != null){
            DataMahasiswa.tampilMahasiswa(mahasiswa2);
            break;
        }
        else{
            System.out.println("Mahasiswa atas nama " + namaMahasiswa2 + " tidak terdaftar\n");
            break;
        }
    case 4:
        // Method tampilMahasiswa (setelah diupdate)
        System.out.print("Masukkan nama Mahasiswa yang akan diupdate: ");
        in.nextLine();
        String namaMahasiswa3 = in.nextLine();
        Mahasiswa mahasiswa3 = DataMahasiswa.cariMahasiswa(namaMahasiswa3);
        if(mahasiswa3 != null){
            System.out.print("Masukkan nama Mahasiswa baru: ");
            String namaBaru = in.nextLine();
            System.out.print("Masukkan jurusan Mahasiswa baru: ");
            String jurusanBaru = in.nextLine();
            System.out.print("Masukkan update status mahasiswa baru. Mahasiswa menikah (true/false): ");
            boolean statusBaru = Boolean.parseBoolean(in.nextLine());
            Mahasiswa mahasiswaBaru = new Mahasiswa(namaBaru, jurusanBaru, statusBaru);
            DataMahasiswa.updateMahasiswa(namaMahasiswa3, mahasiswaBaru);
            System.out.println("Data Mahasiswa berhasil diupdate!");
            DataMahasiswa.tampilMahasiswa(mahasiswaBaru);
            break;
        }
        else{
            System.out.println("Data mahasiswa atas nama " + namaMahasiswa3 + " tidak ditemukan\n");
            break;
        }
    case 5:
        System.out.println("Anda telah keluar.");
        System.exit(0);
    default:
        System.out.println("Pilihan tidak tersedia.\n");
        break;
    }
}

    in.close();
  }
}
