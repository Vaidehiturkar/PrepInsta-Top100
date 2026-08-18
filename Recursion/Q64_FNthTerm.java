package Recursion;

import java.util.Scanner;

public class Q64_FNthTerm {

    static int findTerm(int n, int start) {

        if (n == 0)
            return 0;

        int nextStart = start + n;

        int product = 1;

        for (int i = start; i < nextStart; i++) {
            product = product * i;
        }

        return product + findTerm(n - 1, nextStart);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int result = findTerm(n, 1);

        System.out.println("F(" + n + ") = " + result);

        sc.close();
    }
}