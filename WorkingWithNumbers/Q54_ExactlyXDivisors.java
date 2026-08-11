package WorkingWithNumbers;

import java.util.Scanner;

public class Q54_ExactlyXDivisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.print("Enter number of divisors: ");
        int x = sc.nextInt();

        int count = 0;

        for (int num = start; num <= end; num++) {

            int divisors = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0)
                    divisors++;
            }

            if (divisors == x)
                count++;
        }

        System.out.println("Number of integers = " + count);

        sc.close();
    }
}