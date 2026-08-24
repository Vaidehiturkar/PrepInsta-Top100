package Recursion;

import java.util.Scanner;

public class Q71_NBitBinaryNumbers {

    static void generate(String str, int ones, int zeros, int n) {

        if (str.length() == n) {
            System.out.print(str + " ");
            return;
        }

        generate(str + "1", ones + 1, zeros, n);

        if (ones > zeros)
            generate(str + "0", ones, zeros + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        generate("", 0, 0, n);

        sc.close();
    }
}