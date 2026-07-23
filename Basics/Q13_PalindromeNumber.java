package Basics;

import java.util.Scanner;

public class Q13_PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }

        if (reverse == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}