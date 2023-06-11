package Github;

import java.util.ArrayList;

class DataMahasiswa {

  private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
  //private static Mahasiswa mahasiswa1 = new Mahasiswa();

  public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa){
    mhs.add(mahasiswa);
    return mhs;
  }

  public static void tampilSemuaData(){
    // Gunakan perulangan
    int i = 1;
    for(Mahasiswa mahasiswa : mhs){
        System.out.println("==== Tampilan Data Mahasiswa " + i + " Filkom UB ====");
        System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
        System.out.println("Jurusan         : " + mahasiswa.getJurusan());
        System.out.println("Status          : " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
        System.out.println("");
        i++;
    }
  }

  public static Mahasiswa cariMahasiswa(String nama){
    // Gunakan perulangan
    for(Mahasiswa mahasiswa : mhs){
        if(mahasiswa.getNama().equalsIgnoreCase(nama)){
            return mahasiswa;
        }
    }
    return null;
  }

  public static void tampilMahasiswa(Mahasiswa mahasiswa){
    System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
    System.out.println("Jurusan         : " + mahasiswa.getJurusan());
    System.out.println("Status          : " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
    System.out.println("");
  }

  public static void updateMahasiswa(String nama, Mahasiswa mahasiswa){
    for(int i=0; i<mhs.size(); i++){
        if(mhs.get(i).getNama().equalsIgnoreCase(nama)){
            mhs.set(i, mahasiswa);
            break;
        }
    }
  }
}