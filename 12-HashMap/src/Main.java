package src;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("E00","Nail Polish", 220);
        inventory.addProduct("E01","Lamp", 40);
        inventory.addProduct("E02","Accesories", 85);
        inventory.addProduct("E03","Hair dryer",100);

        inventory.displayAllProducts();

        inventory.deleteProduct("E00");

        inventory.displayAllProducts();

        inventory.deleteProduct("E08");

        inventory.findProduct("E03");
        inventory.findProduct("E04");
    }
}
