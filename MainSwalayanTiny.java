package Github;

import java.util.Scanner;

public class MainSwalayanTiny {
    int pin;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Database data = new Database();
        MainSwalayanTiny obj = new MainSwalayanTiny();
        int pilih, pin, indeks;
        String nopel;
        boolean work;
        int count=0;
        do {
            System.out.print("SELAMAT DATANG DI SWALAYAN TINY\n"+
                             "===========================================================\n"+
                             "Masukan PIN Anda : ");
            pin = input.nextInt();
            obj.getPin(pin);
            System.out.print("Masukan No. Pelanggan Anda : ");
            input.nextLine();
            nopel = input.nextLine();
            work = data.PIN_REK(data.pelanggan, pin, nopel);
            count++;
            if (work == true) {
                obj.nextPage();
            }
            if (work == false) {
                System.out.println("PIN atau No. Pelanggan yang anda masukan salah");
            }
            if ((work == false)&&(count ==3)) {
                System.out.println("!! ANDA TELAH MEMASUKAN PIN YANG SALAH SEBANYAK TIGA KALI !!\n"+
                                   " AKUN ANDA DITANGGUHKAN");
                break;
            } else {
                System.out.println("=======================================================");
            }
        } while (((work == false) && count < 4));
    }
    
    public void nextPage() {
        Scanner input = new Scanner(System.in);
        Database data = new Database();
        int pilih, indeks;
        indeks = Nama(data.pelanggan, pin);
        System.out.println("\nSelamat Datang " +data.pelanggan[indeks].getNama());
        do {
            System.out.print("\n=====================PilihTransaksi======================\n"+
                             "1. Top Up\n"+
                             "2. Transaksi Pembelian\n"+
                             "3. Keluar \n"+
                             "Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("=======================================================");
                    data.TopUp(data.pelanggan[indeks]);
                    data.Display(data.pelanggan[indeks]);
                    System.out.println("=======================================================");
                    break;
                case 2:
                    System.out.println("=======================================================");
                    data.Pembelian(data.pelanggan[indeks]);
                    data.Display(data.pelanggan[indeks]);
                    System.out.println("=======================================================");
                    break;
                case 3:
                    System.out.println("=======================================================");
                    System.out.println("TERIMAKASIH SUDAH BERTRANSAKSI\n"+
                                       "SILAHKAN DATANG KEMBALI DI SWALAYAN TINY");
                    break;
                default:
                    System.out.println("Pilihan Tidak Ditemukan");
            }
        } while (pilih != 3);
    }
    
    public void getPin(int pin) {
        this.pin = pin;
    }
    
    public int Nama(Pelanggan[] pelanggan, int pin) {
        for (int i = 0; i < pelanggan.length; i++) {
            if (pelanggan[i].getPin() == pin) {
                return i;
            }
        }
        return -1;
    }  
}  

