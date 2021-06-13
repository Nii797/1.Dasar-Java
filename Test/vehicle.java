package Test;

import java.security.acl.Owner;

abstract class Vehicle {
    private String nama;
    private String warna;
    // private int jarak = 0;
    // ubah privatet jarak menjadi protected
    protected int jarak = 0;

    // menambahkan owner sebagai pemeilik kendaraan
    private Person owner;

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

    // getter owner
    public Person getOwner() {
        return this.owner;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // settet owner
    public void setOwner(Person person) {
        this.owner = person;
    }

    public void printData() {
        System.out.println("Nama : " + this.nama);
        System.out.println("warna : " + this.warna);
        System.out.println("jarak : " + this.jarak + "Km.");
    }

    // menggunakan method abstrack class karena setiap kendaraan memiliki run nya
    // masing masing

    abstract public void run(int jarak);// memaksa melakukan override dalam subclass

}