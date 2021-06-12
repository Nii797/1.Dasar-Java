package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======= APLIKASI INFORMASI KENDARAAN =======");
        System.out.println("");
        // object dan informasi sepedah
        Sepeda sepeda = new Sepeda("Polygon", "Putih", 20);
        System.out.println("=*=*=*= INFO SEPEDA =*=*=*=");
        sepeda.printData();

        System.out.println("");

        // object dan informasi mobil
        Mobil mobil = new Mobil("Ferrari", "Hitam", 120);
        System.out.println("=*=*=*= INFO MOBIL =*=*=*=");
        mobil.printData();

        // input dan input mengisi bahan bakar
        // System.out.println("Bahan Bakar : " + mobil.getFuel() + "L");
        System.out.println("===========");
        System.out.print("Masukan jumlah isi ulang bahan bakar : ");
        int litre = scanner.nextInt();
        // memanggil method instance 'charge' dan berikan 'litre' sebagai argument
        mobil.charge(litre);
    }

}
