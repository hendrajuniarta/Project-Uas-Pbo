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
        System.out.println("Tipe: Laptop Ultrabook");
        System.out.println("Id: " + getId());
        System.out.println("Merk: " + getMerk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Grafis: " + tipis + "cm");
    }

    public void info(){
            System.out.println("Informasi Laptop Ultrabook");
            System.out.println("============================");
            System.out.println("Ultrabook adalah notebook dengan desain yang tipis, ketebalan ultrabook antara 3 mm diukur dari sisi tertipis dan memiliki berat antara 1,12 kg sampai 1.36 kg. Ultrabook telah menggunakan processor core i5 dan core i7. Selain itu baterai ultrabook tidak dapat dilepas dan sudah menyatu dengan casing atau unibody");
        }
}