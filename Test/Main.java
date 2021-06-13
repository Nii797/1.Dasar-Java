package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // object owner atau pemilik kendaraam
        Person person1 = new Person("Soni", "Hidayatulloh", 23, 180, 76);
        Person person2 = new Person("Ririn", "Novita", 23, 167, 50);

        System.out.println("======= APLIKASI INFORMASI KENDARAAN =======");
        System.out.println("");
        // object dan informasi sepedah
        Sepeda sepeda = new Sepeda("Polygon", "Putih", 20);
        sepeda.setOwner(person2);

        // jadikan 'person2' membeli 'sepeda'
        person2.buy(sepeda);

        System.out.println("=*=*=*= INFO SEPEDA =*=*=*=");
        sepeda.printData();
        System.out.println("===========");
        System.out.println("=*=*=*= INFO PEMILIK SEPEDA =*=*=*=");
        sepeda.getOwner().printData();
        System.out.println("===========");
        System.out.print("Masukan jarak yang ditempuh : ");
        int jaraksepeda = scanner.nextInt();
        sepeda.run(jaraksepeda);

        System.out.println("");

        // object dan informasi mobil
        Mobil mobil = new Mobil("Ferrari", "Hitam", 120);
        mobil.setOwner(person1);

        // jadikan 'person2' membeli 'sepeda'
        person1.buy(mobil);

        System.out.println("=*=*=*= INFO MOBIL =*=*=*=");
        mobil.printData();
        System.out.println("===========");
        System.out.println("=*=*=*= INFO PEMILIK MOBIL");
        mobil.getOwner().printData();

        // jarak yang ditempuh mobil
        System.out.println("===========");
        System.out.print("Masukan jarak yang ditempuh : ");
        int jarakmobil = scanner.nextInt();
        mobil.run(jarakmobil);

        // input dan input mengisi bahan bakar
        // System.out.println("Bahan Bakar : " + mobil.getFuel() + "L");
        System.out.println("===========");
        System.out.print("Masukan jumlah isi ulang bahan bakar : ");
        int litre = scanner.nextInt();
        // memanggil method instance 'charge' dan berikan 'litre' sebagai argument
        mobil.charge(litre);
    }

}
