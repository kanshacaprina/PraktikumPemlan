package inheritance1;
import java.util.Scanner;

public class MainManusia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pilihan;
        
        do {
            System.out.println("============================================");
            System.out.println("================= M E N U ==================");
            System.out.println("|>  1. Manusia          <|");
            System.out.println("|>  2. MahasiswaFILKOM  <|");
            System.out.println("|>  3. Pekerja          <|");
            System.out.println("|>  4. Manager          <|");
            System.out.println("|>  5. Keluar           <|");
            System.out.println("--------------------------------------------");
            System.out.println("***Masukkan Pilihan :");
            System.out.print(">>> ");
            pilihan = input.nextByte();
            System.out.println("--------------------------------------------");
            
            switch (pilihan) {
                case 1:
                    System.out.println(" *** Laki-Laki Telah Menikah ***");
                    Manusia man1 = new Manusia("Saiful", "112", true, true);
                    System.out.println(man1 + "\n");
                    
                    System.out.println(" ***Perempuan Telah Menikah ***");
                    Manusia man2 = new Manusia("Bu Saiful", "121", false, true);
                    System.out.println(man2 + "\n");
                    
                    System.out.println(" ***Belum Menikah ***");
                    Manusia man3 = new Manusia("Lee Haechan", "111", true, false);
                    System.out.println(man3 + "\n");
                    break;
   
                case 2:
                    System.out.println(" ***IPK < 3 ***");
                    MahasiswaFILKOM mf1 = new MahasiswaFILKOM("Muhammad Jamal", "776", true, false, "215150401111037", 2.7);
                    System.out.println(mf1 + "\n");
                    
                    System.out.println(" ***IPK 3 - 3.5 ***");
                    MahasiswaFILKOM mf2 = new MahasiswaFILKOM("Lalisa Nur", "775", false, false, "225150301111012", 3.4);
                    System.out.println(mf2);
                    System.out.println("Beasiswa : " + mf2.getBeasiswaA() + "$\n");
        
                    System.out.println(" ***IPK 3.5 - 4 ***");
                    MahasiswaFILKOM mf3 = new MahasiswaFILKOM("Kansha Caprina", "888", false, false, "225150401111009", 4.0);
                    System.out.println(mf3);
                    System.out.println("Beasiswa : " + mf3.getBeasiswaB() + "$\n");
                    break;
                    
                case 3:
                    System.out.println(" *** LamaBerkerja 2 Tahun, 2 Anak ***");
                    Pekerja test1 = new Pekerja("Adam", "254", true, true, 1500, 2, 3, 4, 2016);
                    System.out.println(test1+"\n");
                    
                    System.out.println(" *** LamaBerkerja 9 Tahun ***");
                    Pekerja test2 = new Pekerja("Eden", "543", false, false, 2000, 0, 2, 4, 1999);
                    System.out.println(test2+"\n");
                    
                    System.out.println(" *** LamaBerkerja 20 Tahun, 10 Anak ***");
                    Pekerja test3 = new Pekerja("Bob", "925", true, true, 2500, 10, 1, 4, 2000);
                    System.out.println(test3+"\n");
                    break;
                
                case 4:
                    System.out.println("*** LamaBerkerja 15 Tahun, gaji $7500***");
                    Manager mnger1 = new Manager("Lee Sooman", "821", true, true, 7500, 1, 4, 2003, 0,"CEO Marketing");
                    System.out.println(mnger1+"\n");
                    break;

                case 5:
                    System.out.println("============================================");
                    System.out.println("========== T e ri m a K a s i h ==========");
                    System.out.println("============================================");
                    System.exit(0);
                    break;

                default:
                    System.out.println("----- !!!Pilihan tidak terdaftar !!! ------");
                    System.out.println("--- !!! SilahkanMulai Ulang Program !!! ---");
                    System.exit(0);
                    break;
                    }
                } while (pilihan != 5);
        }
}
