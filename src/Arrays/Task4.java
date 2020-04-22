package Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main (String [] args) {

        double [] custom = {13, 5, 9, 10, 6, 12, 96, 31};
        int odd = 0;
        int even = 0;

        for (double i : custom) {
            if (i % 2 == 1) {               //odd
                odd++;
            }else {
                even++;                     //even
            }
        }

        double [] arrOdd = new double[odd];
        double [] arrEven = new double[even];

        int countOdd = 0;
        int countEven = 0;

        for (double j : custom) {
            if (j % 2 == 1) {
                arrOdd[countOdd] = j;
                countOdd++;
            } else {
                arrEven[countEven] = j;
                countEven++;
            }
        }

        Arrays.sort(arrEven);                               //sort even
        Arrays.sort(arrOdd);                                //sort odd

        for (int i = 0; i < arrOdd.length / 2; i++) {           //reverse odd array
            double temporary = arrOdd[i];
            arrOdd[i] = arrOdd[arrOdd.length - i - 1];
            arrOdd[arrOdd.length - i - 1] = temporary;
        }

        double [] arrSorted = new double[arrOdd.length + arrEven.length];   //creating of a new array to summarise it
        int j = 0;                                                          //initialize new variable for array

        for (int i = 0; i < arrEven.length; i++) {      //merge 2 arrays into one
            arrSorted[j] = arrEven[i];              //arrSorted{0} = arrEven{6}
            arrSorted[j+1] = arrOdd[i];             //arrSorted{1} = arrOdd{13}
            j += 2;                                 //step 2
        }

        System.out.println(Arrays.toString(arrOdd));
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrSorted));

    }

}
