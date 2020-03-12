package Arrays;

import java.lang.Math;

public class Helper {
    public static int[] getRandomArray (int length, int minRange, int maxRange) {
        int[] arr2 = new int[length];

    //    int minRange = -5;  //range [-5; 5]
     //   int maxRange = 5;

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * ((maxRange - minRange) + 1) + minRange);
        }
        return arr2;
    }

    public static int[] customSort (int[] arrayIn) {
        boolean isSorted = false;

        do {
            for (int i = 0; i < arrayIn.length; i++) {
                if (i + 1 != arrayIn.length
                        && arrayIn[i] > arrayIn[i + 1]) {
                    int tempo = arrayIn[i];
                    arrayIn[i] = arrayIn[i + 1];
                    arrayIn[i + 1] = tempo;
                }
            }
            for (int i = 0; i < arrayIn.length; i++) {
                if (i + 1 != arrayIn.length
                        && arrayIn[i] > arrayIn[i + 1]) {
                    isSorted = false;
                    break;
                } else {
                    isSorted = true;
                }
            }

        } while (!isSorted);

        return arrayIn;
    }

  /*  //custom math random

        // driver code
        public static void main(String args[])
        {
            // define the range
            int max = 10;
            int min = 1;
            int range = max - min + 1;

            // generate random numbers within 1 to 10
            for (int i = 0; i < 10; i++) {
                int rand = (int)(Math.random() * range) + min;

                // Output is different everytime this code is executed
                System.out.println(rand);
            }
        }
*/
}
