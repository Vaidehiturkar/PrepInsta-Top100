package WorkingWithNumbers;

import java.util.Scanner;

public class Q31_GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = 1;

        int min;

        if (num1 < num2)
            min = num1;
        else
            min = num2;

        for (int i = 1; i <= min; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}