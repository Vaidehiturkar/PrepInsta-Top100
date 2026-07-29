package Basics;

import java.util.Scanner;

public class Q21_PrimeFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime Factors are: ");

        for (int i = 2; i <= num; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            while (isPrime && num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }

        sc.close();
    }
}