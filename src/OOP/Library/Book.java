package OOP.Library;

public class Book {

    private String name;
    private String author;
    private String pubHouse;
    private int publish;
    private int pagesNum;
    private boolean isHardcover;
    private double price;

    public Book(String name, String author, String pubHouse, int publish, int pagesNum, boolean isHardcover, double price){
        this.name = name;
        this.author = author;
        this.pubHouse = pubHouse;
        this.publish = publish;
        this.pagesNum = pagesNum;
        this.isHardcover = isHardcover;
        this.price = price;
    }

    public String toString() {
        return String.format(this.name = name,this.author = author, this.pubHouse = pubHouse, this.publish = publish,  this.pagesNum = pagesNum, this.isHardcover = isHardcover, this.price = price);
    }

    public String getName() {
        return name;
    }

    public boolean getIsHardcover() {
        return isHardcover;
    }

    public String getAuthor() {
        return author;
    }

    public String getPubHouse() {
        return pubHouse;
    }

}
