package WorkingWithNumbers;

import java.util.Scanner;

public class Q43_AddTwoFractions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator of first fraction: ");
        int n1 = sc.nextInt();

        System.out.print("Enter denominator of first fraction: ");
        int d1 = sc.nextInt();

        System.out.print("Enter numerator of second fraction: ");
        int n2 = sc.nextInt();

        System.out.print("Enter denominator of second fraction: ");
        int d2 = sc.nextInt();

        int numerator = (n1 * d2) + (n2 * d1);
        int denominator = d1 * d2;

        System.out.println("Sum = " + numerator + "/" + denominator);

        sc.close();
    }
}