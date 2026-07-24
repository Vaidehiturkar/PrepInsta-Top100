package Basics;

import java.util.Scanner;

public class Q15_ArmstrongNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int temp = num;
            int count = 0;
            int sum = 0;

            while (temp != 0) {
                count++;
                temp = temp / 10;
            }

            temp = num;

            while (temp != 0) {

                int rem = temp % 10;
                int power = 1;

                for (int i = 1; i <= count; i++) {
                    power = power * rem;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == num)
                System.out.print(num + " ");
        }

        sc.close();
    }
}