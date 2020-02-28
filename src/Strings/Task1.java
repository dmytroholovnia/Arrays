package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String phrase = scan.nextLine();

        System.out.println("Enter a letter to find: ");
        char ch = scan.next().charAt(0);

        char [] phraseArr = new char [phrase.length()];
        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            phraseArr[i] = phrase.charAt(i);
            int a = phraseArr[i];
            int b = ch;
            if (a == b) {
                count++;
            }
        }
        System.out.println(Arrays.toString(phraseArr));

        System.out.println("'l' letter is " + count + " times.");
    }
}
