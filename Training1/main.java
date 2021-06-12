package Training1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Karakter karakter1 = new Karakter();
        karakter1.setNama("Leon");
        karakter1.setTokoh("Protagonis");
        System.out.print("Masukan Health Pont: ");
        int health = input.nextInt();
        // karakter1.setHealthy(30);
        karakter1.setHealthy(health);
        karakter1.printData();
        System.out.println("==================");
        karakter1.statusHealth(karakter1.getHealth());
    }
}
