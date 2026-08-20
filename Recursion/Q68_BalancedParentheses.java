package Recursion;

import java.util.Scanner;

public class Q68_BalancedParentheses {

    static void generate(String str, int open, int close, int n) {

        if (str.length() == 2 * n) {

            if (isBalanced(str))
                System.out.print(str + " ");

            return;
        }

        if (open < n)
            generate(str + "(", open + 1, close, n);

        if (close < n)
            generate(str + ")", open, close + 1, n);
    }

    static boolean isBalanced(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(')
                count++;
            else
                count--;

            if (count < 0)
                return false;
        }

        return count == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        generate("", 0, 0, n);

        sc.close();
    }
}