package Test;

class Sepeda {

    private String merek;
    private String warna;
    private int jarak = 0;

    Sepeda(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    // GET
    // public String getName() {
    // return this.merek;
    // }

    // public String getWarna() {
    // return this.warna;
    // }

    // public int getJarak() {
    // return this.jarak;
    // }

    // SET
    // public void setJarak(int jarak) {
    // this.jarak = jarak;
    // }

    // mempersingkat method
    public void Dataprint() {
        System.out.println("Nama sepeda : " + this.merek + ".");
        System.out.println("Warna sepeda : " + this.warna + ".");
        System.out.println("Jarak : " + this.jarak + " km.");
    }

    public void run(int jarak) {
        System.out.println("Bergerak " + jarak + " Km ...");
        this.jarak += jarak;
        System.out.println("Jarak : " + this.jarak + " Km.");
    }

}