class LaptopGaming extends Laptop {
    private String grafis;

    // Constructor
    public LaptopGaming(String merk, int harga, String grafis, int id) {
        super(merk, harga, id);
        this.grafis = grafis;
    }

    // Getter dan Setter
    public String getGrafis() {
        return grafis;
    }

    public void setGrafis(String grafis) {
        this.grafis = grafis;
    }

    // Method override untuk menampilkan informasi laptop gaming
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe: Laptop Gaming");
        System.out.println("Grafis: " + grafis);
    }
}
