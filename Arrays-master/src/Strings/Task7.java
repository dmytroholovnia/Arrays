package Strings;

// Пользователь вводит слова по одному. Прервать ввод нужно написав в консоль "EXIT".
// Рандомными образом расставить введенные слова чтобы получилась одна строка-предложение.

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words: ");
        System.out.println("Write EXIT to stop.");
        String stopWord = "EXIT";
        String[] result = new String[100];

        int i = 0;
        String resultFin = "";
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Waiting for a word...");
            String word = scan.nextLine();
            if (word.intern() != stopWord) {
                result[i] = word;
                i++;
            } else {
                isRunning = false;
            }
        }

        for (int j = 0; j < result.length; j++) {
            if (result[j] != null) {
                resultFin += result[j] + " ";
            }
        }


        System.out.println(Arrays.toString(result));
        System.out.println(resultFin);
    }
}
