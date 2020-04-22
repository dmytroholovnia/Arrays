package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //enter numbers until it's valid

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter even positive number: ");
        int enterDigit = scan.nextInt();

        while (enterDigit < 0 || enterDigit % 2 == 1) {     //TODO add different tooltip for negative and odd numbers
            System.out.println("Enter valid value: ");
            enterDigit = scan.nextInt();
        }

        int [] originArray = Helper.getRandomArray(enterDigit, -5, 5);
        System.out.println("Original array: " + Arrays.toString(originArray));
        System.out.println();

        //divide an array into 2 parts

        int arrayHalfLength = originArray.length / 2;

        int [] leftPart = new int [arrayHalfLength];
        int [] rightPart = new int [arrayHalfLength];

        for (int i = 0; i < arrayHalfLength; i++) {
            leftPart[i] = originArray[i];
            rightPart[i] = originArray[arrayHalfLength + i];
        }

        System.out.println("Left part of the array: " + Arrays.toString(leftPart));
        System.out.println("Right part of the array: " + Arrays.toString(rightPart));
        System.out.println();

        //absolute value of all numbers
        for (int i = 0; i < arrayHalfLength; i++) {
            leftPart[i] = Math.abs(leftPart[i]);
            rightPart[i] = Math.abs(rightPart[i]);
        }

        System.out.println("Absolute values of left part of the array: " + Arrays.toString(leftPart));
        System.out.println("Absolute values of right part of the array: " + Arrays.toString(rightPart));
        System.out.println();

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arrayHalfLength; i++) {
            sumLeft += leftPart[i];
            sumRight += rightPart[i];
        }
        System.out.println("The sum of the left part: " + sumLeft);
        System.out.println("The sum of the right part: " + sumRight);
        System.out.println();

        if (sumLeft > sumRight) {
            System.out.println("The amount of LEFT part of the array is larger. ");
        } else {
            System.out.println("The amount of LEFT part of the array is larger. ");
        }
    }
}


