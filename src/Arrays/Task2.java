package Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double[] givenArray = {5, 6, 6, 89, -2, 3, 4, 758, 36, -126, 55578, 666};

        Arrays.sort(givenArray);
        for (int i = givenArray.length - 3; i < givenArray.length; i++) {
            System.out.println(givenArray[i]);
        }
    }
}
