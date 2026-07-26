package Basics;

import java.util.Scanner;

public class Q17_NthFibonacci {

    static int fib(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Nth Fibonacci term = " + fib(n));

        sc.close();
    }
}