public class Task10 {
//10. Рандомно заполненный массив: [5][5]. Найти сумму чисел для Х (см. рисунок), для остальных среднее значение.
//    Х О О О Х
//    О Х X X O
//    О Х O X O
//    О Х X X O
//    Х О О О Х
    public static void main(String[] args) {

        int [][] arr = new int [5][5];
        int sum = 0;
        int elseSum = 0;

        //random fill in
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random()*3);
                if (i == 0 || i == 4) {             //the part to calculate sum for 1 and 5 line
                    if (j == 0 || j == 4) {
                        sum += arr[i][j];
                    } else {
                        elseSum += arr[i][j];
                    }
                } else {
                    if (j == 0 || j == 4) {
                        elseSum += arr[i][j];
                    } else {
                        if (i == 2 && j == 2) {
                            elseSum += arr[i][j];
                        } else {
                            sum += arr[i][j];
                        }
                    }
                }
            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        System.out.println("Summ of marked cells: " + sum);
        System.out.println("The sum of else elements: " + elseSum);

    }
}
