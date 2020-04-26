package OOP.Library;

import OOP.Library.Book;

import java.util.Arrays;


public class Library {
        private Book[] libraryList = new Book[0];

        void addBook(Book book) {
//            books.add(book);
            Book[] newArray = Arrays.copyOf(libraryList, libraryList.length + 1);
            newArray[newArray.length - 1] = book;
            libraryList = newArray;
            //System.out.println(newArray[0]);

        }

        void print() {
            for (int i = 0; i < libraryList.length; i++) {
                System.out.println(libraryList[i]);
            }
        }

        public String searchName(String searchName) {
            for (int i = 0; i < libraryList.length; i++) {
                if (libraryList[i].getName().equals(searchName)) {
                    searchName = libraryList[i].getName();
                }
            }
            System.out.println(searchName);
            return searchName;
        }

        public String searchAutor(String searchAuthor) {
            for (int i = 0; i < libraryList.length; i++) {
                if (libraryList[i].getAuthor().equals(searchAuthor)) {
                    searchAuthor = libraryList[i].getAuthor();
                }
            }
            System.out.println(searchAuthor);
            return searchAuthor;
        }


        public String searchPubHouse(String searchPubHouse) {
                for (int i = 0; i < libraryList.length; i++) {
                    if (libraryList[i].getPubHouse().equals(searchPubHouse)) {
                        System.out.println(libraryList[i].toString());
                        searchPubHouse = libraryList[i].getPubHouse();
                    }
                }
                System.out.println("Search publishing house: " + searchPubHouse);
                return searchPubHouse;
            }


}
