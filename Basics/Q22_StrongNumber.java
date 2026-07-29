package Basics;

import java.util.Scanner;

public class Q22_StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        int original = num;
        int sum = 0;

        while (num != 0) {

            int rem = num % 10;
            sum = sum + fact[rem];
            num = num / 10;
        }

        if (sum == original)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");

        sc.close();
    }
}