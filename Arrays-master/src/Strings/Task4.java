package Strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String str = scan.nextLine();

        char[] arrFromStr = new char[str.length()];

        int counter = 0;

        for (int i = 0; i < arrFromStr.length; i++) {
            counter++;
        }

        System.out.println("There is " + counter + " symbols in your string.");
    }
}
