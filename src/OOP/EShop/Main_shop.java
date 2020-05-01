package OOP.EShop;

public class Main_shop {
    public static void main(String[]args){
        Shop shop = new Shop();
        shop.createRack("alcohol");
        shop.createRack("vegetables");
        shop.createRack("bread");

        shop.addProduct(new ProductType("cucumber", 100, "vegetables"));
        shop.addProduct(new ProductType("baton", 9, "bread"));
        shop.addProduct(new ProductType("nemiroff", 77, "alcohol"));
        shop.addProduct(new ProductType("hlibodar", 90, "alcohol"));

        shop.showRack("vegetables");
        shop.showRack("alcohol");
        shop.showRack("bread");
    }
}
