package Recursion;

import java.util.Scanner;

public class Q67_PascalsTriangleRow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        int value = 1;

        for (int i = 0; i <= n; i++) {

            System.out.print(value + " ");

            value = value * (n - i) / (i + 1);
        }

        sc.close();
    }
}