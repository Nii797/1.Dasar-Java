package Test;

class Person {
    private String firstName;
    private String middleName;
    private String lasName;
    private int age;
    private double height;
    private double weight;

    Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lasName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
        this(firstName, lastName, age, height, weight);
        this.middleName = middleName;
    }

    public String fullName() {
        if (this.middleName == null) {
            return this.firstName + " " + this.lasName;
        } else {
            return this.firstName + " " + middleName + " " + this.lasName;
        }
    }

    public void printData() {
        System.out.println("Nama saya adalah " + this.fullName() + ".");
        System.out.println("Saya berusia " + this.age + " tahun.");
        System.out.println("Tinggi Badan saya " + this.height + "m.");
        System.out.println("Berat Badan saya " + this.weight + "kg.");
        System.out.println("Nilai BMI saya " + Math.round(this.bmi()) + ".");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    // menambahkan method buy
    // mendefifniksan method buy, sharusnya menerima argument bertipe 'Mobil'
    public void buy(Mobil mobil) {
        mobil.setOwner(this);
    }

    // menambahkan method buy
    // mendefifniksan method buy, sharusnya menerima argument bertipe 'Sepeda'
    public void buy(Sepeda sepeda) {
        sepeda.setOwner(this);
    }
}