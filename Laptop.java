class Laptop {
    private String merk;
    private int harga;
    private int id;

    // Constructor
    public Laptop(String merk, int harga, int id) {
        this.merk = merk;
        this.harga = harga;
        this.id = id;
    }

    public Laptop(){
        
    }

    // Getter dan Setter get untuk mengambil data set untuk mengubah data
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Method untuk menampilkan informasi laptop
    public void tampilkanInfo() {
        System.out.println("Id:" + id);
        System.out.println("Merk: " + merk);
        System.out.println("Harga: Rp " + harga);
    }
}