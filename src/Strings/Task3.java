package Strings;

// Удалить из строки ее часть с заданной позиции и заданной длины.
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println("Enter a number of letter where from to show: ");
        int start = scan.nextInt();
        System.out.println("How many symbols to show from that place: ");
        int leng = scan.nextInt();
        int end = start + leng;

        str = str.substring(start, end);

        System.out.println(str);

    }
}
