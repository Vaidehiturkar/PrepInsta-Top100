package Basics;

import java.util.Scanner;

public class Q23_PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 1;

        if (num == 1) {
            System.out.println("Not a Perfect Number");
            sc.close();
            return;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                sum = sum + i;

                if (i != num / i) {
                    sum = sum + (num / i);
                }
            }
        }

        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        sc.close();
    }
}