class LaptopUltrabook extends Laptop {
    private double tipis;

    // Constructor
    public LaptopUltrabook(String merk, int harga, double tipis, int id) {
        super(merk, harga, id);
        this.tipis = tipis;
    }

    // Getter dan Setter
    public double getTipis() {
        return tipis;
    }

    public void setTipis(double tipis) {
        this.tipis = tipis;
    }

    // Method override untuk menampilkan informasi laptop ultrabook
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe: Laptop Ultrabook");
        System.out.println("Ketebalan: " + tipis + " cm");
    }
}