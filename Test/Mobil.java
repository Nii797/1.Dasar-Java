package Test;

public class Mobil extends Vehicle {

    private int fuel = 0;

    public int getFuel() {
        return this.fuel;
    }

    public void charge(int litre) {
        System.out.println("Menambahkan " + litre + "Liter ...");

        if (litre <= 0) {
            System.out.println("Tidak ada bahan bakar yang diisi");
        } else if (litre + this.fuel >= 100) {
            System.out.println("Tangki sekarang penuh");
            this.fuel = 100;
        } else {
            this.fuel += litre;
        }
        System.out.println("Bahan bakar: " + this.fuel + "L");
    }

}

// private String nama;
// private String warna;
// private int berat;
// private int jarak = 0;
// private int fuel = 100;

// Mobil(String nama, String warna, int berat) {
// this.nama = nama;
// this.warna = warna;
// this.berat = berat;
// }

// public void printData() {
// System.out.println("Nama Mobil: " + this.nama + ".");
// System.out.println("Warna Mobil: " + this.warna + ".");
// System.out.println("Berat Mobil: " + this.berat + "Kg.");
// System.out.println("Jarak Mobil: " + this.jarak + " Km.");
// System.out.println("Bahan Bakar: " + this.fuel + "L");
// }

// public void runMobil(int jarak) {
// System.out.println("Bergerak " + jarak + " Km ...");
// if (jarak <= this.fuel) {
// this.jarak += jarak;
// this.fuel -= jarak;
// } else {
// System.out.println("Bahan bakar tidak cukup");
// }

// // this.jarak += jarak;
// System.out.println("Jarak : " + this.jarak + " Km.");
// System.out.println("Bahan Bakar: " + this.fuel + "L");
// }

// public void isiBensin(int isi) {
// System.out.println("Menambahkan " + isi + "L");

// if (isi <= 0) {
// System.out.println("Bahan tidak terisi");
// } else if (isi + this.fuel >= 100) {
// System.out.println("Bahan bakar kelebihan");
// this.fuel = 100;
// } else {
// this.fuel += isi;
// }

// System.out.println("Bahan bakar " + this.fuel + "L");

// }