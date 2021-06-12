package Training1;

class Game {
    private String nama;
    private String tokoh;

    public String getNama() {
        return this.nama;
    }

    public String getTokoh() {
        return this.tokoh;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTokoh(String tokoh) {
        this.tokoh = tokoh;
    }

    public void printData() {
        System.out.println("Nama Karakter: " + nama + ".");
        System.out.println("Tokoh : " + tokoh + ".");
    }
}
