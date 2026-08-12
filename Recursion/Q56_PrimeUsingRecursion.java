package Recursion;

import java.util.Scanner;

public class Q56_PrimeUsingRecursion {

    static boolean isPrime(int num, int i) {

        if (num < 2)
            return false;

        if (i > num / 2)
            return true;

        if (num % i == 0)
            return false;

        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num, 2))
            System.out.println("Yes, it is a prime number");
        else
            System.out.println("No, it is not a prime number");

        sc.close();
    }
}