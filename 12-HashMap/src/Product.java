package src;

public class Product {
    final String productCode;
    final String name;
    int quantity;

    Product(final String productCode, final String name, int quantity){
        this.productCode = productCode;
        this.name = name;
        if(quantity<0){
            throw new IllegalArgumentException("Кількість не може бути від'ємною");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return productCode + " " + name + " " + quantity;
    }

}
