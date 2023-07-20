import java.util.ArrayList;
import java.util.List;

public class Gudang {
    private ArrayList<Laptop> laptops = new ArrayList<Laptop>();
    // arraylist untuk menyimpan daftar laptop digudang

    public Gudang() {
        laptops = new ArrayList<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }
    
    public void deleteLaptop(int id) {
        Laptop laptopToDelete = null;
        for (Laptop laptop : laptops) {
            if (laptop.getId() == id) {
                laptopToDelete = laptop;
                break;
            }
        }
        if (laptopToDelete != null) {
            laptops.remove(laptopToDelete);
        }
    }

    public void showLaptop() {
        for (Laptop laptop : laptops) {
            laptop.tampilkanInfo();
            System.out.println();
        }
    }
    public boolean isLaptopIdExist(int id) {
        for (Laptop laptop : laptops) {
            if (laptop.getId()==id) {
                return true;
            }
        }
        return false;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void showLaptopByType(int type) {
        for (Laptop laptop : laptops) {
            if (type == 1 && laptop.getClass().equals(Laptopbiasa.class)) {
                laptop.info();
                System.out.println();
            } else if (type == 2 && laptop.getClass().equals(LaptopGaming.class)) {
                laptop.info();
                System.out.println();
            } else if (type == 3 && laptop.getClass().equals(LaptopUltrabook.class)) {
                laptop.info();
                System.out.println();
            }else {
                System.out.println("Tipe laptop tidak valid.");
            }
        }
    }
}
