package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Sepeda sepeda1 = new Sepeda("Pasific", "Putih");
        System.out.println("【Info Sepeda】");
        sepeda1.Dataprint();
        System.out.println("----------------------------");
        System.out.print("Masukan jarak yang akan ditempuh: ");
        int input = scanner.nextInt();
        sepeda1.run(input);

    }

}
