public class Person3 {

    // new
    // menyembunyikan informasi
    // mengubah field-field public dibawah public menjadi private
    // studi kasus mengambil nama tengah atau middleName
    private static int Count = 0;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double weight;
    private double height;
    private String hobi;

    // construct atau constructor
    Person3(String firstName, String lastName, int age, double weight, double height, String hobi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hobi = hobi;
        // menambahkan satu persatu atau sama dengan 1 + 1
        Person3.Count++;
    }

    Person3(String firstName, String middleName, String lastName, int age, double weight, double height, String hobi) {
        this(firstName, lastName, age, weight, height, hobi);
        this.middleName = middleName;
    }

    public String fullName() {
        if (this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + lastName;
        }
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void printData() {

        System.out.println("");
        System.out.println("===================================================");
        System.out.println("Nama Saya " + fullName() + ".");
        System.out.println("Umur Saya " + this.age + ".");

        if (this.age < 18) {
            System.out.println("Kamu belum dewasa dan kamu belum boleh bekerja");
        } else if (this.age <= 19) {
            System.out.print("Kamu sudah dewasa tapi belum boleh bekerja");
        } else if (this.age >= 23) {
            System.out.println("Kamu sudah dewasa dan boleh bekerja");
        }

        System.out.println("TInggi Saya " + this.height + ".");
        System.out.println("Berat Saya " + this.weight + ".");
        System.out.println("Hobi Saya " + this.hobi + ".");
        System.out.println("===================================================");
        System.out.println("");
    }

    public static void printCount() {
        System.out.println("Total : " + Person3.Count + " orang.");
    }
}
