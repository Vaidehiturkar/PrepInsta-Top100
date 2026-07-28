package Basics;

import java.util.Scanner;

public class Q19_PowerOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * num;
        }

        System.out.println("Answer = " + result);

        sc.close();
    }
}