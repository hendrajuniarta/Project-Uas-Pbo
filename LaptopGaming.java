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
        System.out.println("Tipe: Laptop Gaming");
        System.out.println("Id: " + getId());
        System.out.println("Merk: " + getMerk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Grafis: " + grafis);
    }

    public void info() {
        System.out.println("Informasi Laptop Gaming");
        System.out.println("========================");
        System.out.println("Laptop Gaming adalah tipe laptop yang dirancang khusus untuk memaksimalkan pengalaman bermain game yang memuaskan. Biasanya tipe laptop ini dibekali dengan spesifikasi tinggi dibandingkan laptop biasa agar mampu menangani game berat yang menuntut gameplay yang mulus pada frame rate yang tinggi.");
    }
}
