package src;
import java.util.HashMap;

public class Inventory {
    HashMap<String, Product> products = new HashMap<>();

    public void addProduct(String productCode, String name, int quantity){
        Product product = new Product(productCode, name, quantity);

        products.put(productCode, product);

        System.out.println("Продукт додан: " + product.toString());
    }

    public void deleteProduct(String productCode){
        if(products.containsKey(productCode)){
            products.remove(productCode);
            System.out.println("Продукт " + productCode + "- видалено");
        } else {
            System.out.println("Продукт " + productCode + " не знайдено аби видалити");
        }

    }

    public Product findProduct(String productCode){
        if(products.containsKey(productCode)){
            Product wantedProduct =  products.get(productCode);
            System.out.println("Знайдено продукт " + wantedProduct);
            return wantedProduct;
        } else{
            System.out.println("Такого продукту за кодом " + productCode + " не знайдено");
            return null;
        }
    }

    public void displayAllProducts(){
        if(products.isEmpty()){
            System.out.println("Інвентар порожній");
        } else{
            for(Product product: products.values()){
                System.out.println("Код продукту " + product.productCode + " назва та кількість:" + product.name + " " + product.quantity);
            }
        }
    }
}