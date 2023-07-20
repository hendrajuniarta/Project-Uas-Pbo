import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Gudang gudang = new Gudang();
    static Laptop laptop;

    public static void main(String[] args) {
        initGudangData();

        String isContinue = "y";

        while (isContinue.equals("y")) {
            showMenu();
            int selectedMenu = chooseMenu();

            try {
                if (selectedMenu == 1) {
                    gudang.showLaptop();
                } else if (selectedMenu == 2) {
                    // Create a new Laptop object
                    Laptop newLaptop = createLaptop();
                    if (newLaptop != null) {
                        gudang.addLaptop(newLaptop);
                    }
                } else if (selectedMenu == 3) {
                    deleteLaptop();
                } 
                else if (selectedMenu == 4) {
                    showLaptopInfo();
                }else {
                    System.out.println("Salah input");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

            System.out.print("Lanjutkan ?");
            isContinue = scan.next();
        }
    }

    

    public static void showMenu() {
        System.out.println("================================");
        System.out.println("1. show laptop list");
        System.out.println("2. add laptop");
        System.out.println("3. delete laptop");
        System.out.println("4. info laptop");
        System.out.println("================================");
    }

    public static void initGudangData() {
        // Inisialisasi data gudang awal

        Laptopbiasa laptopBiasa1 = new Laptopbiasa("Asus" , 10000000, 1);
        LaptopGaming laptopGaming1 = new LaptopGaming("MSI", 15000000, "NVIDIA GeForce RTX 3080", 2);
        laptopGaming1.setGrafis("NVIDIA Geforce GTX1650");

        LaptopUltrabook laptopUltrabook1 = new LaptopUltrabook("Asus", 10000000, 2, 3);
        laptopUltrabook1.setTipis(3);

        gudang.addLaptop(laptopBiasa1);
        gudang.addLaptop(laptopGaming1);
        gudang.addLaptop(laptopUltrabook1);
    }

    private static Laptop createLaptop() {
        System.out.print("Masukkan id laptop: ");
        int id = scan.nextInt();
    
        if (gudang.isLaptopIdExist(id)) {
            System.out.println("Id sudah terpakai!");
            return null;
        }
    
        System.out.print("Masukkan merk laptop: ");
        String merk = scan.next();
    
        System.out.print("Masukkan tipe laptop (1 - Laptop Biasa, 2 - Laptop Gaming, 3 - Laptop Ultrabook): ");
        int tipe = scan.nextInt();
    
        System.out.print("Masukkan harga laptop: ");
        int harga = scan.nextInt();
    
        Laptop newLaptop = null;
    
        if (tipe == 1) {
            newLaptop = new Laptopbiasa(merk, harga, id);
        } else if (tipe == 2) {
            System.out.print("Masukkan jenis grafis: ");
            String jenisKartuGrafis = scan.next();
            newLaptop = new LaptopGaming(merk, harga, jenisKartuGrafis, id);
        } else if (tipe == 3) {
            System.out.print("Masukkan ketebalan: ");
            double ketebalan = scan.nextDouble();
            newLaptop = new LaptopUltrabook(merk, harga, ketebalan, id);
        } else {
            System.out.println("Tipe laptop tidak valid.");
        }
    
        if (newLaptop != null) {
            // Memanggil metode setter untuk mengatur nilai atribut laptop yang sedang dibuat
            System.out.print("Masukkan merk laptop baru: ");
            newLaptop.setMerk(scan.next());
    
            System.out.print("Masukkan harga laptop baru: ");
            newLaptop.setHarga(scan.nextInt());
        }
    
        return newLaptop;
    }
    

    private static void deleteLaptop() {
        System.out.print("Masukkan id laptop yang ingin dihapus: ");
        int id = scan.nextInt();

        if (gudang.isLaptopIdExist(id)) {
            gudang.deleteLaptop(id);
            System.out.println("Laptop dengan ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("Laptop dengan ID " + id + " tidak ditemukan.");
        }
    }

    private static void showLaptopInfo() {
        System.out.print("Masukkan tipe laptop (1 - Laptop Biasa, 2 - Laptop Gaming, 3 - Laptop Ultrabook): ");
        int tipe = scan.nextInt();

        gudang.showLaptopByType(tipe);
    }


    public static int chooseMenu() {
        int pilihan = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("choose menu : ");
                pilihan = scan.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scan.next(); // clear scanner buffer
            }
        }

        return pilihan;
    }
}
