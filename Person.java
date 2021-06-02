public class Person {

    public static void PrintData(String firstName, String lastName, int age, double height, double weight) {

        System.out.println("=================================================");
        System.out.println("Nama kamu adalah " + fullName(firstName, lastName));
        System.out.println("Usia anda " + age + "tahun.");
        if (age > 18) {
            System.out.print("Anda sudah dewasa");
        } else {
            System.out.print("Anda belum dewasa");
        }

        System.out.println("Tinggi badan anda " + height + "m.");
        System.out.println("Tinggi badan anda " + weight + "kg.");
        double bmi = bmi(height, weight);
        System.out.println("Nilai BMI saya " + Math.round(bmi) + ".");
        if (isHealthy(bmi)) {
            System.out.println("Saya sehat!");
        } else {
            System.out.println("Saya tidak sehat");
        }

    }

    public static String fullName(String firstname, String lasName) {
        return firstname + " " + lasName;
    }

    public static double bmi(double height, double weight) {
        return weight / height / height;
    }

    public static boolean isHealthy(double bmi) {
        return bmi >= 18.5 && bmi < 25.0;
    }
}
