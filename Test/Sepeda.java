package Test;

class Sepeda extends Vehicle {

    Sepeda(String nama, String warna, int jarak) {
        // super untuk memanggil constructor
        super(nama, warna, jarak);
    }

    public void run(int jarak) {
        System.out.println("Bergerak " + jarak + "km ...");
        this.jarak += jarak;
        System.out.println("Jarak : " + this.jarak + "km");
    }
}