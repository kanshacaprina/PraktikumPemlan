package Github;

public class Pelanggan {
    private int Saldo, Pin;
    private String NmrRek, Nama, Jenis;
    
    public Pelanggan(int Saldo, int Pin, String NmrRek, String Nama) {
        char[] digit = new char[2];
        for (int i=0; i<digit.length; i++) {
            digit[i] = NmrRek.charAt(i);
            int nilai = Integer.parseInt(String.valueOf(digit[i]));
            this.Saldo = Saldo;
            this.Pin = Pin;
            this.NmrRek = NmrRek;
            this.Nama = Nama;
            if (nilai == 56){
                Jenis = "Gold";
            }
            else if (nilai == 38){
                Jenis = "Silver";
            }
            else if (nilai == 74){
                Jenis = "Platinum";
            }
        }
    }
    
    public int getSaldo() {
        return Saldo;
    }
    
    public int getPin() {
        return Pin;
    }
    
    public String getNmrRek() {
        return NmrRek;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getJenis() {
        return Jenis;
    }
    
    public void setSaldo(double Saldo) {
        this.Saldo = (int) Saldo;
    }
    
    public void setPin(int Pin) {
        this.Pin = Pin;
    }
}
