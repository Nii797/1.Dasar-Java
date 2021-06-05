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
    private String profesi;

    // construct atau constructor
    Person3(String firstName, String lastName, int age, double weight, double height, String hobi, String profesi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hobi = hobi;
        this.profesi = profesi;
        // menambahkan satu persatu atau sama dengan 1 + 1
        Person3.Count++;
    }

    Person3(String firstName, String middleName, String lastName, int age, double weight, double height, String hobi,
            String profesi) {
        this(firstName, lastName, age, weight, height, hobi, profesi);
        this.middleName = middleName;
    }

    public String fullName() {
        if (this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + lastName;
        }
    }

    // GETTER
    public String getMiddleName() {
        return this.middleName;
    }

    // GETTER PROFESI
    public String getProfesi() {
        return this.profesi;
    }

    // SETTER
    public String setMiddleName(String middleName) {
        return this.middleName = middleName;
    }

    // SETTER PROFESI
    // public String setProfesi(String profesi) {
    // return this.profesi = profesi;
    // }
    // versi 2
    public void setProfesi(String profesi) {
        this.profesi = profesi;
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
        System.out.println("Profesi saya adalah " + this.profesi + ".");
        System.out.println("===================================================");
        System.out.println("");
    }

    public static void printCount() {
        System.out.println("Total : " + Person3.Count + " orang.");
    }
}
