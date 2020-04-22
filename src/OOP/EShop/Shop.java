package OOP.EShop;

public class Shop {

}

class Person {
    private String name;
    private double salary;
    private int identNum;
    private String type;
}

class Admin extends Person {
    private String type = "Admin";
}

class Marketer extends Person {
    private String type = "Marketer";
}
