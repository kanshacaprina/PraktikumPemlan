package Github;

import java.util.Scanner;

public class Database {
    Pelanggan[] pelanggan = new Pelanggan[3];
    Scanner input = new Scanner(System.in);
    
    public Database(){
        pelanggan[0] = new Pelanggan(9000000, 488129, "3808125204", "Jaemin");
        pelanggan[1] = new Pelanggan(9000000, 199928, "5608211078", "Caca");
        pelanggan[2] = new Pelanggan(9000000, 281199, "7408131585", "Jamal");
    }
    
    public void TopUp(Pelanggan pelanggan){
        int nilai, saldo;
        boolean work;
        do {
            System.out.print("Masukkan jumlah top up yang diinginkan: ");
            nilai = input.nextInt();
            saldo = pelanggan.getSaldo() + nilai;
            work = SaldoAkhir(saldo);
            if (work == true)
                System.out.println("\nSELAMAT! ANDA BERHASIL TOP UP SEBESAR Rp" + nilai);
        } while (work == false);
        pelanggan.setSaldo(saldo);
    }
    
    public void Pembelian(Pelanggan pelanggan){
        String pilih;
        int saldo1, saldo2, pin, indeks = 0, a = 0;
        double nilai;
        boolean work;
        System.out.print("Total Belanja : ");
        nilai = input.nextInt();
        if (pelanggan.getJenis().equalsIgnoreCase("Gold")) {
            if (nilai >= 1000000)
                saldo1 = (int) (pelanggan.getSaldo() - (nilai - (nilai * 0.07)));
            else
                saldo1 = (int) (pelanggan.getSaldo() - (nilai - (nilai * 0.02)));
        } else if (pelanggan.getJenis().equalsIgnoreCase("Silver")) {
            if (nilai >= 1000000)
                saldo1 = (int) (pelanggan.getSaldo() - (nilai - (nilai * 0.05)));
            else
                saldo1 = (int) ((double) pelanggan.getSaldo() - nilai);
        } else {
            if (nilai >= 1000000)
                saldo1 = (int) (pelanggan.getSaldo() - (nilai - (nilai * 0.1)));
            else
                saldo1 = (int) (pelanggan.getSaldo() - (nilai - (nilai * 0.05)));
        }
        pelanggan.setSaldo(saldo1);
        work = SaldoAkhir(saldo1);
        System.out.println("Transaksi pembelian sebesar Rp" + (int) nilai + " Sukses");
    }
    
    public void Display(Pelanggan pelanggan){
        System.out.println("Saldo Anda Saat Ini : Rp" + pelanggan.getSaldo());
    }
    
    public boolean PIN_REK(Pelanggan[] pelanggan, int pin, String rek){
        int nilai = 0;
        for (int i = 0; i < pelanggan.length; i++) {
            if (pelanggan[i].getPin() == pin) {
                if (pelanggan[i].getNmrRek().equalsIgnoreCase(rek))
                    nilai++;
            }
        }
        if (nilai == 1)
            return true;
        else {
            return false;
        }
    }
    
    public static boolean SaldoAkhir(int saldo){
        if (saldo >= 100000)
            return true;
        else{
            return false;
        }
    }
}

