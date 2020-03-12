package Strings;

import java.util.Arrays;
import java.lang.String;

public class lesson2602 {
    public static void main(String[] args) {
        String string = new String("School");
        String string1 = "Hello, world! My name is Roman =)";


        System.out.println(Arrays.toString(string1.split(" ")));

        String[] string2 = string1.split(" ");

        int[] arrLength = new int[string2.length];


        for (int i = 0; i < string2.length; i++) {
            arrLength[i] = string2[i].length();
        }

        System.out.println(Arrays.toString(arrLength));

    }
}
