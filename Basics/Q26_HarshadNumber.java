package Basics;

import java.util.Scanner;

public class Q26_HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {

            sum = sum + (num % 10);
            num = num / 10;
        }

        if (original % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");

        sc.close();
    }
}