package Test;

public class Mobil {
    private String nama;
    private String warna;
    private int jarak = 0;

    Mobil(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public void printData() {
        System.out.println("Nama Mobil: " + this.nama + ".");
        System.out.println("Warna Mobil: " + this.warna + ".");
        System.out.println("Jarak Mobil: " + this.jarak + " Km.");
    }

    public void runMobil(int jarak) {
        System.out.println("Bergerak " + jarak + " Km ...");
        this.jarak += jarak;
        System.out.println("Jarak : " + this.jarak + " Km.");
    }

}
