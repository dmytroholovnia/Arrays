import java.util.Arrays;

public class Task3 {
    public static void main (String [] args) {

        double [] usual = {1566, 2, 3, 68, 35.2, 5, 568, 4657, 5647};

        Arrays.sort(usual);

        for (int i = 0; i < usual.length / 2; i++) {
            double temporary = usual[i];
            usual[i] = usual[usual.length - i - 1];
            usual[usual.length - i - 1] = temporary;
        }
        System.out.println(Arrays.toString(usual));
    }
}
