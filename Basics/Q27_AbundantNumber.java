package Basics;

import java.util.Scanner;

public class Q27_AbundantNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Not an Abundant Number");
            sc.close();
            return;
        }

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                sum = sum + i;

                if (i != num / i) {
                    sum = sum + (num / i);
                }
            }
        }

        if (sum > num)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");

        sc.close();
    }
}