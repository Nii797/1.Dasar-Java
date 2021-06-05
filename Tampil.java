// import java.util.Scanner;

public class Tampil {

    public static void main(String[] args) {

        Person3 orang1 = new Person3("Soni", "Hidayatuloh", 23, 180.5, 75.7, "ngoding", "Senior Progammer");
        orang1.setProfesi("Fullstack Developer & Senior Engginering");
        orang1.printData();

        Person3 orang2 = new Person3("Yahya", "Nasrun", "Rizal", 65, 1.75, 80.0, "Musik", "Musisi");
        orang1.printData();

        Person3 orang3 = new Person3("Leon", "Kennedy", 25, 90, 185.9, "Drink", "Agent DSO");
        orang3.setMiddleName("Scott");
        orang3.printData();

        System.out.println(orang1.getMiddleName());

        Person3.printCount();

        System.out.println("Nama tengah dari orang ke 2 adalah " + orang2.getMiddleName() + ".");
        System.out.println("Profesi dari orang ke 1 diubah dan menjadi dua profesi yaitu " + orang1.getProfesi() + ".");

    }

}
