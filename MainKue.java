package Github;

public class MainKue {
    public static void main(String[] args){
        double beratP = 0;
        int hargaP=0;
        int hargaJ=0;
        double JumlahJ=0;
        
        KueJadi[] kueJadiArray = new KueJadi[10];
        kueJadiArray[0] = new KueJadi("Basah Cake", 2, 15000);
        kueJadiArray[1] = new KueJadi("Pavlova", 2, 19000);
        kueJadiArray[2] = new KueJadi("Lamington", 4, 18000);
        kueJadiArray[3] = new KueJadi("Cheese Cake", 5, 19000);
        kueJadiArray[4] = new KueJadi("Black Forest", 6, 21000);
        kueJadiArray[5] = new KueJadi("Tiramisu", 2, 22000);
        kueJadiArray[6] = new KueJadi("Madeleines", 1, 17000);
        kueJadiArray[7] = new KueJadi("Pandan Cake", 1, 19000);
        kueJadiArray[8] = new KueJadi("Tres Leches", 1, 21000);
        kueJadiArray[9] = new KueJadi("Victoria Sponge", 2, 21000);
        
        KuePesanan[] kuePesananArray = new KuePesanan[10];
        kuePesananArray[0] = new KuePesanan("Chiffon Cake", 2, 17000);
        kuePesananArray[1] = new KuePesanan("Brownies", 1, 12000);
        kuePesananArray[2] = new KuePesanan("Kukus ", 3, 19000);
        kuePesananArray[3] = new KuePesanan("Bolu", 4, 15000);
        kuePesananArray[4] = new KuePesanan("Lapis", 3, 13000);
        kuePesananArray[5] = new KuePesanan("Prol Tape", 2, 17000);
        kuePesananArray[6] = new KuePesanan("Caramel Cake", 5, 23000);
        kuePesananArray[7] = new KuePesanan("Tiramisu", 1, 26000);
        kuePesananArray[8] = new KuePesanan("Aplle Pie", 2, 27000);
        kuePesananArray[9] = new KuePesanan("Lapis Legit", 2, 18000);
        
        for (KueJadi currentKueJ : kueJadiArray){
            System.out.println(currentKueJ);
            hargaJ += currentKueJ.hitungHarga();
            JumlahJ += currentKueJ.getJumlah();
        }
        
        for (KuePesanan currentKueP : kuePesananArray){
            System.out.println(currentKueP);
            hargaP += currentKueP.hitungHarga();
            beratP += currentKueP.getBerat();
        }
        
        int tertinggiJ = 0;
        int tertinggiP = 0;
        String namaKueJadiTertinggi = "";
        String namaKuePesananTertinggi = "";
        
        for (KuePesanan currentKueP : kuePesananArray){
            if (currentKueP.hitungHarga() > tertinggiP){
                tertinggiP = (int)currentKueP.hitungHarga();
                namaKuePesananTertinggi = currentKueP.nama;
            }
        }
        
        for (KueJadi currentKueJ : kueJadiArray){
            if (currentKueJ.hitungHarga() > tertinggiJ){
                tertinggiJ = (int)currentKueJ.hitungHarga();
                namaKueJadiTertinggi = currentKueJ.nama;
            }
        }
        
        System.out.println("============Informasi Kue============");
        System.out.println("Harga Total\t\t : " + (hargaP + hargaJ));
        System.out.println("Total Harga Kue Jadi\t : " + hargaJ);
        System.out.println("Total Jumlah Kue Jadi\t : " + JumlahJ);
        System.out.println("Total Harga Kue Pesanan\t : " + hargaP);
        System.out.println("Total Berat Kue Pesanan\t : " + beratP + "gram");
        System.out.println("Harga Kue Pesanan Termahal  : " + tertinggiP);
        System.out.println("Nama Kue Pesanan Termahal   : " + namaKuePesananTertinggi);
        System.out.println("Harga Kue Jadi Termahal     : " + tertinggiJ);
        System.out.println("Nama Kue Jadi Termahal      : " + namaKueJadiTertinggi);
    }
}

