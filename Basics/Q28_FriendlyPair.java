package Basics;

import java.util.Scanner;

public class Q28_FriendlyPair {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum1 = getSum(num1);
        int sum2 = getSum(num2);

        if ((double) sum1 / num1 == (double) sum2 / num2)
            System.out.println("Friendly Pair");
        else
            System.out.println("Not a Friendly Pair");

        sc.close();
    }

    static int getSum(int num) {

        if (num == 1)
            return 0;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                sum = sum + i;

                if (i != num / i)
                    sum = sum + (num / i);
            }
        }

        return sum;
    }
}