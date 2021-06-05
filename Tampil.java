// import java.util.Scanner;

public class Tampil {

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Masukan");
        // System.out.println("Awal total " + Person3.Count + " Orang.");

        Person3 orang1 = new Person3("Soni", "Hidayatuloh", 23, 180.5, 75.7, "ngoding");
        orang1.printData();

        Person3 orang2 = new Person3("Alex", "Jhon", "Baret", 24, 170.1, 67.9, "ngegame");
        orang2.printData();

        Person3 orang3 = new Person3("jhonny", "Vincent", 27, 173.2, 70.7, "musik");
        orang3.printData();

        Person3.printCount();

        // System.out.println("Total Jumlah : " + Person3.Count + " orang.");

    }

}
