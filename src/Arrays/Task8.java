package Arrays;

import java.util.Arrays;

public class Task8 {

//    Найти сумму чисел из рандомно заполненного от 0 до 9 массива [100]
//    используя в качестве индекса числа Фибоначи. Для остальных чисел найти среднее.

    public static void main(String[] args) {

        //fibonacci array
        int[] fibonacciArr = new int [100];

            fibonacciArr[0] = 0;
            fibonacciArr[1] = 1;

        for (int i = 2; i < fibonacciArr.length; i++) {
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
        }

        int [] randomArrayPP = Helper.getRandomArray(100, 0, 9);    //get random array

        int sumFibonacci = 0;
        int sumElse = 0;
        int count = 0;

        for (int i = 0; i < randomArrayPP.length; i++) {
            boolean isFib = false;
            for (int j = 0; j < fibonacciArr.length; j++) {
                if (i == fibonacciArr[j]) {
                    isFib = true;
                    break;
                }
            }
            if (isFib) {
                sumFibonacci += randomArrayPP[i];
            } else {
                sumElse += randomArrayPP[i];
                count++;
            }
        }

       int midSumElse = sumElse / count;

        System.out.println(Arrays.toString(fibonacciArr));
        System.out.println(Arrays.toString(randomArrayPP));
        System.out.println(sumFibonacci);
        System.out.println(midSumElse);
    }
}
