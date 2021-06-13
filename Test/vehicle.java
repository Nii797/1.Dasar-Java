package Test;

class Vehicle {
    private String nama;
    private String warna;
    // private int jarak = 0;
    // ubah privatet jarak menjadi protected
    protected int jarak = 0;

    Vehicle(String nama, String warna, int jarak) {
        this.nama = nama;
        this.warna = warna;
        this.jarak = jarak;
    }

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