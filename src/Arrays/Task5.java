package Arrays;

import java.util.Arrays;

public class Task5 {    //Переставить в массиве четные в начало (по возростанию), потом нечетные (по убыванию), а нули в конец массива

    public static void main (String [] args) {

        double [] defaultArr = {3, 5, 7, 6745, 777, 0, 5467, 34, 56, -2, 32};     //default array

        int odd = 0;    //empty array for odd numbers
        int even = 0;   //empty array for even numbers
        int zeros = 0;  //empty array for zeros


        for (double i : defaultArr) {
            if (i * i == 0) {
                zeros++;
            } else if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(zeros);

        double [] arrOdd = new double[odd];
        double [] arrEven = new double[even];
        double [] arrZeros = new double[zeros];

        int countOdd = 0;
        int countEven = 0;
        int countZeros = 0;

        for (double i : defaultArr) {               //[34.0, 56.0, -2.0, 32.0]
            if (i * i == 0) {                       //[3.0, 5.0, 7.0, 6745.0, 5467.0]
                arrZeros[countZeros] = i;           //[0.0, 0.0]
                countZeros++;
            } else if (i % 2 == 0) {
                arrEven[countEven] = i;
                countEven++;
            } else {
                arrOdd[countOdd] = i;
                countOdd++;
            }
        }
         Arrays.sort(arrEven);      //[-2.0, 32.0, 34.0, 56.0] , sort of even array

        for (int i = 0; i < arrOdd.length / 2; i++) {           //reverse odd array
            double temporary = arrOdd[i];                       //[5467.0, 6745.0, 7.0, 5.0, 3.0]
            arrOdd[i] = arrOdd[arrOdd.length - i - 1];
            arrOdd[arrOdd.length - i - 1] = temporary;
        }

        //concatenate 3 arrays

        int evenLeng = arrEven.length;
        int oddLeng = arrOdd.length;
        int zerosLeng = arrZeros.length;

        double [] finalArray = new double[evenLeng + oddLeng + zerosLeng];
        int j = 0;

        System.arraycopy(arrEven, 0, finalArray, 0, evenLeng);
        System.arraycopy(arrOdd, 0, finalArray, evenLeng, oddLeng);
        System.arraycopy(arrZeros, 0, finalArray, oddLeng, zerosLeng);

      /*  for (int i = 0; i < finalArray.length; i++) {
            if (i < arrEven.length) {
                finalArray[j] = arrEven[i];
            } else if (i < arrOdd.length) {
                finalArray[j] = arrOdd[i];
            } else {
                finalArray[j] = arrZeros[i];
            }
        }*/


        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));
        System.out.println(Arrays.toString(arrZeros));
        System.out.println(Arrays.toString(finalArray));

    }
}
