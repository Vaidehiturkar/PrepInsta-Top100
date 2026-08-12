package Recursion;

import java.util.Scanner;

public class Q55_PowerUsingRecursion {

    static int power(int base, int power) {

        if (power == 0)
            return 1;

        return base * power(base, power - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = power(base, power);

        System.out.println("Result = " + result);

        sc.close();
    }
}