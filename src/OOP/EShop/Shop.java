package OOP.EShop;

import java.util.ArrayList;

public class Shop {
    ArrayList<Rack> shop = new ArrayList<>();

    void createRack(String name) {
        shop.add(new Rack(name));
    }


    void addProduct(ProductType product) {
        String rackName = product.getProductType();

        for (Rack obj : shop) {
            if (rackName.equals(obj.getRackName())) {
                obj.addProductRack(product);
            }
        }


    }

    void showRack(String rackName) {
        for (int i = 0; i < shop.size(); i++) {
            if (rackName.equals(shop.get(i).getRackName())) {
                shop.get(i).printRackProducts();
            }
        }
    }
}
