package Test;

class Vehicle {
    private String nama;
    private String warna;
    private int jarak = 0;

    public String getNama() {
        return this.nama;
    }

    public String getWarna() {
        return this.warna;
    }

    public int getJarak() {
        return this.jarak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printData() {
        System.out.println("Nama : " + this.nama);
        System.out.println("warna : " + this.warna);
        System.out.println("jarak : " + this.jarak + "Km.");
    }

}