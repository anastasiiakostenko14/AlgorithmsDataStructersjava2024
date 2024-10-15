package src;

//Костенко -> K має код 202 => 202%6 = 4. Варіант - 4

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("E00","Nail Polish", 220);
        Product product2 = new Product("E01", "Lamp", 40);
        Product product3 = new Product("E02","Accesories", 85);
        Product product4 = new Product("E03","Hair dryer",100);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);

        inventory.displayAllProducts();

        inventory.deleteProduct("E00");

        inventory.displayAllProducts();

        inventory.deleteProduct("E08");

        inventory.findProduct("E03");
        inventory.findProduct("E04");
    }
}
