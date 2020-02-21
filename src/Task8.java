import java.util.Arrays;

public class Task8 {

//    Найти сумму чисел из рандомно заполненного от 0 до 9 массива [100]
//    используя в качестве индекса числа Фибоначи. Для остальных чисел найти среднее.

    public static void main(String[] args) {

        //fibonacci array
        int n0 = 1;
        int n1 = 1;
        int n2;
        int[] fibonacciArr = new int [20];

        for (int i = 0; i < 2; i++) {
            fibonacciArr[i] = 1;
        }

        for(int i = 3; i <= fibonacciArr.length; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            fibonacciArr[i-1] = n2;
        }

        int [] randomArrayPP = Helper.getRandomArray(100, 0, 9);

        for (int i = 0; i < fibonacciArr.length; i++) {
            if (randomArrayPP[i] < fibonacciArr[i]) {
                int sum += fibonacciArr[i];
            }
        }

    }
}
