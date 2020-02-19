public class Task6 {

    public static int indexOfArray(int arr[], int digit) {

        if (arr == null ) {     //empty arr check
            return -1;
        }

        int length = arr.length;
        int i = 0;

        while (i < length) {
            if (arr[i] == digit) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main (String [] args) {

        int [] defaultArray = {5, 6, 9, 658, 0, -657, 674, 222};
        int index  = 0;

        index = indexOfArray(defaultArray, 0);

        System.out.println(index);

    }
}
