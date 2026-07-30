package Basics;

import java.util.Scanner;

public class Q24_PerfectSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 1; i <= num; i++) {

            if (i * i == num) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}