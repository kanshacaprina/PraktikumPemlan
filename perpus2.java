package Github;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class perpus2
{
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak; 
    private String sinopsis;
    private int harga;
    private int persenRoyalti;
    private int royalti;
    private int penjualan;

public perpus2(){

}

public perpus2(String category, String writer, String title, String language, String publish, String edition, int page, String synopsis){
    kategori = category;
    penulis = writer;
    judul = title;
    bahasa = language;
    penerbitan = publish;
    edisi = edition;
    halaman = page;
    sinopsis = synopsis;
}

public String[] getpenulisbanyak() 
{
    return penulisbanyak;
}

public String getJudul(){
    return judul;
}

public String getPenulis(){
    return penulis;
}

public void setPenulisbanyak(String[] s) 
{
    this.penulisbanyak = s;
}

public void setKategori(String k) 
{
    kategori = k;
}

public void setPenulis(String p) 
{
    penulis = p;
}

public void setJudul(String j) 
{
    judul = j;
}

public void setPenerbitan(String terbit) 
{
    penerbitan = terbit;
}

public void setEdisi(String e) 
{
    edisi = e;
}

public void setHalaman(int hal) 
{
    halaman = hal;
}

public void setBahasa(String b) 
{
    bahasa = b;
}

public void setSinopsis(String sinop)
{
    sinopsis = sinop;
}

public void setPenjualan(int penjualan){
    this.penjualan = penjualan;
}


public static int hitungKata(String sinopsis) 
{
    if (sinopsis == null || sinopsis.isEmpty()) 
    {
        return 0;
    }
    
    String[] kata = sinopsis.split("\\s+");
    return kata.length;
}


public double cekTingkatKesamaan(perpus2 objek) 
{
    int kesamaanAtribut = 0;
    int totalAtribut = 0;

    if (Arrays.equals(this.penulisbanyak, objek.penulisbanyak)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.kategori.equals(objek.kategori)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.penulis.equals(objek.penulis)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.judul.equals(objek.judul)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.bahasa.equals(objek.bahasa)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.penerbitan.equals(objek.penerbitan)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.edisi.equals(objek.edisi)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.halaman == objek.halaman) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    if (this.sinopsis.equals(objek.sinopsis)) 
    {
        kesamaanAtribut++;
    }
    totalAtribut++;

    double persenKesamaan = 0;
    persenKesamaan = ((double) kesamaanAtribut/totalAtribut)*100;
    return persenKesamaan;
}

public void simpanFile(String namaFile){
    try{
        FileWriter simpan = new FileWriter(namaFile);
        BufferedWriter writer = new BufferedWriter(simpan);
        writer.write(judul +"; "+ penulis);
        writer.close();
    }
    catch(IOException data){
        System.out.println("Error: " + data.getMessage());
    }
}

public void bacaFile(String pathFile){
    try{
        File file = new File (pathFile);
        Scanner input = new Scanner(file);
        String data = input.nextLine();
        String databeneran [] = data.split("; ");
        this.judul = databeneran[0];
        this.penulis = databeneran[1];
        input.close();
        System.out.println("Isi txt: " + data);
    }
    catch(FileNotFoundException isi){
        System.out.println("File not found: " + isi.getMessage());
    }
}

public int hitungRoyalti(int harga){
    this.harga = harga;
    royalti = (penjualan*harga*10)/100;
    return royalti;
}

public int hitungRoyalti(int harga, int persenRoyalti){
    this.harga = harga;
    this.persenRoyalti = persenRoyalti;
    royalti = (penjualan*harga*persenRoyalti)/100;
    return royalti;
}

public void displayMessage() 
{
    System.out.println(judul);
    System.out.println("Informasi Buku: ");
    System.out.println("Kategori : " + kategori);
    if (this.penulisbanyak == null) 
    {
        System.out.println("Penulis : " + penulis);
    } 
    else 
    {
        System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]", ""));
    }
    System.out.println("Penerbitan : " + penerbitan);
    System.out.println("Edisi : " + edisi);
    System.out.println("Jumlah Halaman : " + halaman);
    System.out.println("Bahasa : " + bahasa);
    System.out.println("Sinopsis : " + sinopsis);
    System.out.println("Jumlah Kata Sinopsis : " + hitungKata(sinopsis));
    System.out.println("Penjualan buku: " + penjualan);
    System.out.println("Royalti penulis: " + royalti);
}
}

