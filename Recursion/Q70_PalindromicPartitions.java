package Recursion;

import java.util.Scanner;

public class Q70_PalindromicPartitions {

    static void partition(String str, int index, String result) {

        if (index == str.length()) {
            System.out.println(result);
            return;
        }

        for (int i = index; i < str.length(); i++) {

            String part = str.substring(index, i + 1);

            if (isPalindrome(part)) {
                partition(str, i + 1, result + part + " ");
            }
        }
    }

    static boolean isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        partition(str, 0, "");

        sc.close();
    }
}