package Recursion;

import java.util.Scanner;

public class Q71_NBitBinaryNumbers {

    static void generate(String str, int n) {

        if (str.length() == n) {

            int ones = 0;
            int zeros = 0;

            for (int i = 0; i < n; i++) {

                if (str.charAt(i) == '1')
                    ones++;
                else
                    zeros++;

                if (zeros > ones)
                    return;
            }

            System.out.print(str + " ");
            return;
        }

        generate(str + "0", n);
        generate(str + "1", n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        generate("", n);

        sc.close();
    }
}