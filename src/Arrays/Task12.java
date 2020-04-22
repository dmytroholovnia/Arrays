package Arrays;

import java.util.Arrays;

public class Task12 {

    //Найти в рандомно заполненном массиве [4][4][4] чисел 4 элемента наибольших и 4 наименьшим значениями.
    //Вывести эти элементы на экран, а также вывести сумму всех остальных элементов (4 min и 4 max в сумму не входят).

    public static void main(String[] args) {
        int[][][] threeDim = new int[4][4][4];
        int leng = threeDim.length;

        //filling of array
        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < leng; j++) {
                for (int k = 0; k < leng; k++) {
                    threeDim[i][j][k] = (int) (Math.random() * 9);
                }
            }
        }
        System.out.println(Arrays.deepToString(threeDim));


        int minArr[] = new int[3];
        int maxArr[] = new int[3];
        boolean isSorted = false;

        do {
            for (int i = 0; i < leng; i++) {
                for (int j = 0; j < leng; j++) {
                    for (int k = 0; k < leng; k++) {
                        if (k + 1 != leng && threeDim[i][j][k] > threeDim[i][j][k + 1]){
                            int tempo = threeDim[i][j][k];
                            threeDim[i][j][k] = threeDim[i][j][k + 1];
                            threeDim[i][j][k + 1] = tempo;
                        }
                    }
                    for (int k = 0; k < leng; k++) {
                        if (k + 1 != leng && threeDim[i][j][k] > threeDim[i][j][k + 1]) {
                            isSorted = false;
                            break;
                        } else {
                            isSorted = true;
                        }
                    }
                }

            }
        } while (!isSorted);
        System.out.println(Arrays.deepToString(threeDim));

    }
}
