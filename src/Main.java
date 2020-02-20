import java.lang.Math; // 1.  Найти максимальное значение из массива

public class Main {
    public static void main (String [] args) {

        double firstArray[] = {23654, 5, 6, 6, 9, 23, 1} ;

        double maxNum = Double.MIN_VALUE;

        for (int i = 0; i < firstArray.length; i++) {
            maxNum = Math.max(maxNum, firstArray[i]);
        }

        System.out.println(maxNum);
    }


}
