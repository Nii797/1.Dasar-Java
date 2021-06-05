public class Person3 {

    // membuat varaibel Count untuk menghitung jumlah orang
    // dan hitung dimulai dari nol
    // private
    public static int Count = 0;
    public String firstName;
    // middle untuk overload constuctor
    public String middleName;
    public String lastName;
    public int age;
    public double weight;
    public double height;
    public String hobi;

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

    // Person3(String firstName, String middleName, String lastName, int age, double
    // weight, double height, String hobi) {
    // this.firstName = firstName;
    // this.lastName = lastName;
    // this.age = age;
    // this.weight = weight;
    // this.height = height;
    // this.hobi = hobi;
    // // menambahkan satu persatu atau sama dengan 1 + 1
    // Person3.Count++;
    // this.middleName = middleName;
    // }

    // cara kedua memanggil constructor sebelumnya
    Person3(String firstName, String middleName, String lastName, int age, double weight, double height, String hobi) {
        this(firstName, lastName, age, weight, height, hobi);
        this.middleName = middleName;
    }

    // method fullname
    // public String fullName() {
    // return this.firstName + " " + this.lastName;
    // }

    // method fullname versi 1
    public String fullName() {
        if (this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + lastName;
        }
    }

    // method
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
