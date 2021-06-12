package Training1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // OBJECT KARAKTER 1
        Karakter karakter1 = new Karakter();
        System.out.print("Masukan nama: ");
        String inputnama = input.nextLine();
        karakter1.setNama(inputnama);
        karakter1.setTokoh("Protagonis");
        System.out.print("Masukan Health Pont: ");
        int health = input.nextInt();
        // karakter1.setHealthy(30);
        karakter1.setHealthy(health);
        karakter1.printData();
        System.out.println("==================");
        karakter1.statusHealth(karakter1.getHealth());

        // OBJECT KERAKTER 2
        Senjata senjata1 = new Senjata();
        senjata1.setNama("Handgun");
        senjata1.printData();

    }
}
