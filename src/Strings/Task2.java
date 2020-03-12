package Strings;

// Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String str = scan.nextLine();

        String[] strChar = str.split(" ");
        String result = "";

        for (int i = 0; i < strChar.length; i++) {
            char[] wordCh = strChar[i].toCharArray();  //разбили слово на массив символов
            for (int j = 0; j < strChar[i].length() / 2; j++) {     //в каждом слове поменять буквы в обратном порядке
                //перестановка в обратном порядке
                char tempo = wordCh[j];
                wordCh[j] = wordCh[wordCh.length - j - 1];
                wordCh[wordCh.length - j - 1] = tempo;
            }
            if (i != strChar.length - 1) {              //вывод результата
                result += new String(wordCh) + ' ';
            } else {
                result += new String(wordCh);
            }
        }

        System.out.println(result);
    }
}
