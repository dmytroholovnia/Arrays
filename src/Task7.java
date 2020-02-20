import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //enter numbers until it's valid

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter even positive number: ");
        int enterDigit = scan.nextInt();

        do {
            System.out.println("enter valid value: ");
            enterDigit = scan.nextInt();
        } while (enterDigit < 0 || enterDigit % 2 == 1);

        int [] array = Helper.getRandomArray(enterDigit);
        System.out.println(Arrays.toString(array));
    }


}


