package Strings;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String phrase = "We love to WizardsDev - it's love";
        String[] divPhrase = phrase.split(" ");

        boolean isSorted = false;

        do {
            for (int i = 0; i < divPhrase.length - 1; i++) {
                if (divPhrase[i].length() > divPhrase[i + 1].length() && i + 1 != divPhrase.length) {
                    String tempo = divPhrase[i];
                    divPhrase[i] = divPhrase[i + 1];
                    divPhrase[i + 1] = tempo;
                }
            }

            for (int i = 0; i < divPhrase.length - 1; i++) {
                if (divPhrase[i].length() > divPhrase[i + 1].length() && i + 1 != divPhrase.length) {
                    isSorted = false;
                    break;
                } else {
                    isSorted = true;
                }
            }
        } while (!isSorted);

        System.out.println(Arrays.deepToString(divPhrase));

    }
}
