package OOP.Library;

public class Submain {
    public static void main(String[]args){

        Library library = new Library();
        library.addBook(new Book("bible", "jesus", "Aurora", 0, 700, true, 10));
        library.addBook(new Book("happy pig", "papa carlo", "Bukva",1600, 15, false, 5));
        library.addBook(new Book("Shantaram", "Gregory David Roberts", "Mahaon",2003, 1307, true, 500));

        //library.print();
       // library.searchName("Shantaram");
       // library.searchAutor("jesus");
        library.searchPubHouse("Aurora");

    }
}
