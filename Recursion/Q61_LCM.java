package Recursion;

import java.util.Scanner;

public class Q61_LCM {

    static int lcm(int a, int b, int current) {

        if (current % a == 0 && current % b == 0)
            return current;

        return lcm(a, b, current + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int start = Math.max(num1, num2);

        int result = lcm(num1, num2, start);

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + result);

        sc.close();
    }
}