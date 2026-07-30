package Basics;

import java.util.Scanner;

public class Q24_PerfectSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int root = (int) Math.sqrt(num);

        if (root * root == num)
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}