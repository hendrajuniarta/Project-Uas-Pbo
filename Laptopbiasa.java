class Laptopbiasa extends Laptop {
    public Laptopbiasa(String merk, int harga, int id) {
        super(merk, harga, id);
    
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Tipe: Laptop Biasa");
        System.out.println("Id: " + getId());
        System.out.println("Merk: " + getMerk());
        System.out.println("Harga: " + getHarga());
    }

    public void info(){
        System.out.println("Informasi Laptop Biasa");
        System.out.println("========================");
        System.out.println("Ini adalah laptop biasa dengan spesifikasi standar.");
    }

}