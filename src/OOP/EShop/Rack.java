package OOP.EShop;

import java.util.ArrayList;

public class Rack {
    ArrayList<ProductType> edibleRack = new ArrayList<>();
    //ArrayList<edibleProduct> notEdibleRack = new ArrayList<>();
    private String name;


    Rack (String name) {
        this.name = name;
    }

    public String getRackName() {
        return name;
    }

    void printRackProducts() {
            for (int i = 0; i < edibleRack.size(); i++) {
                System.out.println(edibleRack.get(i));
            }
    }

    void addProductRack(ProductType product) {
        edibleRack.add(product);
    }
}
