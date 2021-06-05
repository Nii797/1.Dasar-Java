// import java.util.Scanner;

public class Tampil {

    public static void main(String[] args) {

        Person3 orang1 = new Person3("Soni", "Hidayatuloh", 23, 180.5, 75.7, "ngoding");
        orang1.printData();

        Person3 orang2 = new Person3("Yahya", "Nasrun", "Rizal", 65, 1.75, 80.0, "Musi");
        orang1.printData();

        System.out.println(orang1.getMiddleName());

        Person3.printCount();

        System.out.println("Nama tengah dari orang ke 2 adalah " + orang2.getMiddleName() + ".");

    }

}
