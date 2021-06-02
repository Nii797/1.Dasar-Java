import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah orang : ");
        int n = scanner.nextInt();

        // usia tertua perhitungan dimulai dari nol
        int ageMax = 0;
        int totalAge = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Orang ke : " + (i + 1));

            System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.print("Masukan Nama Depan : ");
            String firstName = scanner.next();

            System.out.print("Masukan Belakang : ");
            String lastName = scanner.next();

            System.out.println("Usia : ");
            int age = scanner.nextInt();
            if (age > ageMax) {
                ageMax = age;
            }

            totalAge += age;

            System.out.println("Tinggi Badan : ");
            double height = scanner.nextDouble();

            System.out.println("Berat Badan : ");
            double weight = scanner.nextDouble();

            Person.PrintData(firstName, lastName, age, height, weight);
        }

        System.out.println("Usia tertua adalah : " + ageMax + " Tahun.");
        System.out.println("Rata-rata usia adalah : " + totalAge + " Tahun.");

    }

}