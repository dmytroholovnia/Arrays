package Arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //Задан массив [5][5]. Создать копию массива с зеркально расположенными элементами. Центр симметрии находится в точке [3][3].

        //Быстрый вывод двумерного массива - System.out.printLn(Arrays.deepToString(myArray));
        int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int [][] mirrorArr = new int [5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                mirrorArr[i][j] = arr[arr.length-1-i][arr.length-1-j];
            }
        }

        //two-dimensional array output
        System.out.println("Default array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Mirror array:");
        for (int i = 0; i < mirrorArr.length; i++) {
            for (int j = 0; j < mirrorArr.length; j++) {
                System.out.print(mirrorArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
