import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    static Scanner scan = new Scanner(System.in);
    static Gudang gudang = new Gudang();

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
                    Laptop newLaptop = Main.createLaptop();
                    gudang.addLaptop(newLaptop);
                }else if (selectedMenu == 3) {
                    deleteLaptop();
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
        System.out.println("================================");
    }

    public static void initGudangData() {
        // Inisialisasi data gudang awal
        Laptop laptop1 = new Laptop("ASUS", 8000000, 1);
        Laptop laptop2 = new Laptop("Lenovo", 9000000, 2);
        LaptopGaming laptopGaming1 = new LaptopGaming("MSI", 15000000, "NVIDIA GeForce RTX 3080", 3);
        LaptopUltrabook laptopUltrabook1 = new LaptopUltrabook("Dell", 12000000, 1.5, 4);

        gudang.addLaptop(laptop1);
        gudang.addLaptop(laptop2);
        gudang.addLaptop(laptopGaming1);
        gudang.addLaptop(laptopUltrabook1);
    }

   private static Laptop createLaptop() {
    System.out.print("Masukkan id laptop: ");
    int id = scan.nextInt();
    int tipe;
    int harga;
    String merk;

    Laptop laptop = new Laptop();

    if (gudang.isLaptopIdExist(id)){
        System.out.println("Id sudah terpakai!");
    }
    else {
    System.out.print("Masukkan merk laptop: ");
     merk = scan.next();

    System.out.print("Masukkan tipe laptop (1 - Laptop Biasa, 2 - Laptop Gaming, 3 - Laptop Ultrabook): ");
    tipe = scan.nextInt();

    System.out.print("Masukkan harga laptop: ");
    harga = scan.nextInt();
   
    

    if (tipe == 1) {
        laptop = new Laptop(merk, harga, id);
    } else if (tipe == 2) {
        System.out.print("Masukkan jenis grafis: ");
        String jenisKartuGrafis = scan.next();
        laptop = new LaptopGaming(merk, harga, jenisKartuGrafis, id);
    } else if (tipe == 3) {
        System.out.print("Masukkan ketebalan: ");
        double ketebalan = scan.nextDouble();
        laptop = new LaptopUltrabook(merk, harga, ketebalan, id);
    } else {
        System.out.println("Tipe laptop tidak valid.");
    }
}
    return laptop;
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
