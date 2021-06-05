// import java.util.Scanner;

public class Tampil {

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Masukan");
        // System.out.println("Awal total " + Person3.Count + " Orang.");

        Person3 orang1 = new Person3("Soni", 23, 180.5, 75.7, "ngoding");
        Person3 orang2 = new Person3("Alex", 24, 170.1, 67.9, "ngegame");
        Person3 orang3 = new Person3("jhonny", 27, 173.2, 70.7, "musik");

        orang1.printData();
        orang2.printData();
        orang3.printData();

        Person3.printCount();

        // System.out.println("Total Jumlah : " + Person3.Count + " orang.");

    }

}
