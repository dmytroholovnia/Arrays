package OOP.EShop;

public class Product {
    public String name;
    public float price;

    public Product(float price, String name) {
        this.name = name;
        this.price = price;
    }

    public float getProductPrice() {     //getter for product price
        return price;
    }

    public void setProdName(String newName) {       // сеттер для названия
        this.name = newName;
    }

    public void setPrice(float newPrice) {       // сеттер для цены
        this.price = newPrice;
    }

    public String toString() {
        return String.format("%s %f", this.name, this.price);
    }

}

class ProductType extends Product {       //съедобные товары
    private String productType;

    ProductType(String name, float price, String productType) {
        super(price, name);
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public String toString() {
        return String.format("|product: %s | price = %.2f | rackType: %s |", this.name, this.price, this.productType);
    }


}
