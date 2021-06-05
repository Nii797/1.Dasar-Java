public class Person2 {

    public String firstName;
    public String lastName;
    public int age;
    public double height;
    public double weight;

    Person2(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String fullName() {
        return this.firstName + " " + lastName;
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public void printData() {
        System.out.println("Nama saya " + fullName() + ".");
        System.out.println("Saya berusia " + this.age + " tahun.");
        // membulatkan Nilai BMI
        System.out.println("Nilai BMI saya " + Math.round(this.bmi()) + ".");

        // System.out.println("Nilai BMI saya " + bmi());
    }

    // public static void menyapa() {
    // System.out.println("Hai");
    // }

}
