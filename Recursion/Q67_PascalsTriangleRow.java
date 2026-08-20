package Recursion;

import java.util.Scanner;

public class Q67_PascalsTriangleRow {

    static int combination(int n, int r) {

        if (r == 0 || r == n)
            return 1;

        return combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            System.out.print(combination(n, i) + " ");
        }

        sc.close();
    }
}