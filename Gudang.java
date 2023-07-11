import java.util.ArrayList;

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
}
