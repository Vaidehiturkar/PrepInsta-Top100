package WorkingWithNumbers;

import java.util.Scanner;

public class Q49_CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = String.valueOf(number).length();

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}