package Recursion;

import java.util.Scanner;

public class Q56_PrimeUsingRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = true;

        if (num < 2) {
            prime = false;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Yes, it is a prime number");
        else
            System.out.println("No, it is not a prime number");

        sc.close();
    }
}