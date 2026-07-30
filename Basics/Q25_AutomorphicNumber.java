package Basics;

import java.util.Scanner;

public class Q25_AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int divisor = (int) Math.pow(10, digits);

        if (square % divisor == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}