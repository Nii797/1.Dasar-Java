package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // OBJEK SEPEDA
        Sepeda sepeda1 = new Sepeda("Pasific", "Putih");
        System.out.println("[Info Sepeda]");
        sepeda1.Dataprint();
        System.out.println("----------------------------");
        System.out.print("Masukan jarak yang akan ditempuh: ");
        int inputsepeda1 = scanner.nextInt();
        sepeda1.run(inputsepeda1);

        // OBJEK MOBIL
        System.out.println("============================");
        Mobil mobil1 = new Mobil("Golf GTI", "Warna", 120);
        System.out.println("[Info Mobil]");
        mobil1.printData();
        System.out.println("----------------------------");
        System.out.print("Masukan jarak yang akan ditempuh: ");
        int inputmobil1 = scanner.nextInt();
        mobil1.runMobil(inputmobil1);
    }

}
