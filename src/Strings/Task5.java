package Strings;

//Вывести слова в обратном порядке.
//+ применить алгоритм с задачи 2, т.е. слова идут в обратном порядке +они перевернуты.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String str = scan.nextLine();

        String[] strChar = str.split(" ");
        String result = "";                             //для вывода окончательного результата

        for (int i = 0; i < strChar.length / 2; i++) {       //перестановка СЛОВ в обратном порядке
            String tempo2 = strChar[i];
            strChar[i] = strChar[strChar.length - i - 1];
            strChar[strChar.length - i - 1] = tempo2;
        }

        for (int i = 0; i < strChar.length; i++) {

            char[] wordCh = strChar[i].toCharArray();  //разбили слово на массив символов

            for (int j = 0; j < strChar[i].length() / 2; j++) {     //в каждом слове поменять буквы в обратном порядке
                //перестановка БУКВ в обратном порядке
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
