package Github;

public class javaPerpus2
{
    public static void main(String[] args) 
    {
        perpus2 b1 = new perpus2();
        b1.setJudul("A History of science technology and philosophy in the eighteenth century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbitan("LondonGeorge Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.setSinopsis("Sejarah awal mula dari keajaiban sains teknologi yang tercipta, tertuang dalam sebuah buku");
        b1.setPenjualan(17);
        b1.hitungRoyalti(219000);
        b1.displayMessage();
        System.out.println("=====================================");
    
        perpus2 b2 = new perpus2();
        b2.setJudul("Information and Communication Technology, dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setPenulisbanyak(new String[] {"Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa", "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan", "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah", "Sri Budi Lestari", "Edi antoso","M as’Amah"});
        b2.setPenerbitan("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setHalaman(178);
        b2.setSinopsis("Literasi dalam bentuk buku ini akan membukakan pintu wawasan pada luasnya kemarakan teknologi komunikasi dan informasi digital");
        b1.setPenjualan(9);
        b1.hitungRoyalti(119000);
        b2.displayMessage();
        System.out.println("=====================================");

        perpus2 b3 = new perpus2();
        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbitan("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.setSinopsis("Sophie, seorang remaja dengan kehidupan berkutat filsafat dan eksistensi melalui hal-hal misterius");
        b1.setPenjualan(40);
        b1.hitungRoyalti(109000);
        b3.displayMessage();
        System.out.println("=====================================");

        perpus2 b4 = new perpus2();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbitan("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.setSinopsis("Bagaimana ujaran kata dalam bahasa dan pemikiran manusia membentuk realitas filsafat yang ada");
        b1.setPenjualan(78);
        b1.hitungRoyalti(96000);
        b4.displayMessage();
        System.out.println("=====================================");

        perpus2 b5 = new perpus2();
        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbitan("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.setSinopsis("Buku ini merangkum perjalanan sejarah pendidikan Islam serta dinamika dan perkembangannya");
        b1.setPenjualan(9);
        b1.hitungRoyalti(109000);
        b5.displayMessage();
        System.out.println("=====================================");

        perpus2 b6 = new perpus2();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbitan("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.setSinopsis("Historia dalam Islam, terdapat pada bagaimana hadis pada masa kini mulanya dijaga, dituliskan, hingga tersampaikan utuh");
        b1.setPenjualan(3);
        b1.hitungRoyalti(79000);
        b6.displayMessage();
        System.out.println("=====================================");

        perpus2 b7 = new perpus2();
        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbitan("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);
        b7.setSinopsis("Adab serta kebiasaan Rasulullah SAW, bagaimana beliau bertutur lembut dan menghargai lawan bicaranya");
        b1.setPenjualan(51);
        b1.hitungRoyalti(59000);
        b7.displayMessage();
        System.out.println("=====================================");

        perpus2 b8 = new perpus2();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbitan("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.setSinopsis("Buku ini memuat perjalanan spiritual nan berharga seorang hamba dalam mencintai Allah SWT");
        b1.setPenjualan(44);
        b1.hitungRoyalti(99000);
        b8.displayMessage();
        System.out.println("=====================================");

        perpus2 b9 = new perpus2();
        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbitan("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.setSinopsis("Bagaimana kebahagiaan dalam hidup dapat diciptakan dari strategi berdasarkan psikologi");
        b1.setPenjualan(27);
        b1.hitungRoyalti(139000);
        b9.displayMessage();
        System.out.println("=====================================");

        perpus2 b10 = new perpus2();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbitan("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.setSinopsis("Buku ini memuat teori yang perlu dipahami dalam tes psikologi serta contoh latihan studi");
        b1.setPenjualan(18);
        b1.hitungRoyalti(159000);
        b10.displayMessage();
        System.out.println("=====================================");

        perpus2 b11 = new perpus2();
        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbitan("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.setSinopsis("Nasionalisme berada di ujung tombak pada zaman yang rakyatnya terombang-ambing");
        b1.setPenjualan(31);
        b1.hitungRoyalti(49000);
        b11.displayMessage();
        System.out.println("=====================================");
        
        perpus2 b12 = new perpus2();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbitan("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.setSinopsis("Buku ini mencatat pengalaman Pramoedya Ananta Toer ketika mendekam di penjara sebagai tawanan");
        b1.setPenjualan(90);
        b1.hitungRoyalti(79000);
        b12.displayMessage();
        System.out.println("=====================================");
        
        perpus2 b13 = new perpus2();
        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbitan("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.setSinopsis("Kisah fiksi seorang wanita melepas masa lalunya lewat perjalanan spiritual yang membuatnya menemukan jati diri");
        b1.setPenjualan(203);
        b1.hitungRoyalti(119000);
        b13.displayMessage();
        System.out.println("=====================================");
        
        perpus2 b14 = new perpus2();
        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbitan("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.setSinopsis("Ketika dendam kelam dan persaingan antara dua keluarga besar berlangsung");
        b1.setPenjualan(101);
        b1.hitungRoyalti(110000);
        b14.displayMessage();
        System.out.println("=====================================");
        
        perpus2 b15 = new perpus2();
        b15.setJudul("Dilan 1990");
        b15.setPenulis("Pidi Baiq");
        b15.simpanFile("F:/Pemrograman Lanjut/Pemrograman Lanjut/src.txt");

        perpus2 b16 = new perpus2();
        b16.bacaFile("F:/Pemrograman Lanjut/Pemrograman Lanjut/src.txt");
        System.out.println("Judul: " + b16.getJudul());
        System.out.println("Penulis: " + b16.getPenulis());
        System.out.println("=====================================");

        System.out.println("Tingkat Kesamaan : " + b1.cekTingkatKesamaan(b3) + "%");
        System.out.println("Tingkat Kesamaan : " + b4.cekTingkatKesamaan(b14) + "%");
        System.out.println("Tingkat Kesamaan : " + b7.cekTingkatKesamaan(b12) + "%");
    }
}
