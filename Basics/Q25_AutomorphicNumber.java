package Basics;

import java.util.Scanner;

public class Q25_AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        int temp = num;
        int sq = square;

        boolean flag = true;

        while (temp > 0) {

            if (temp % 10 != sq % 10) {
                flag = false;
                break;
            }

            temp = temp / 10;
            sq = sq / 10;
        }

        if (flag)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}