package Recursion;

import java.util.Scanner;

public class Q70_PalindromicPartitions {

    static void partition(String str, int index, String result) {

        if (index == str.length()) {
            System.out.println(result);
            return;
        }

        for (int i = index; i < str.length(); i++) {

            if (isPalindrome(str, index, i)) {

                partition(str, i + 1,
                        result + str.substring(index, i + 1) + " ");
            }
        }
    }

    static boolean isPalindrome(String str, int start, int end) {

        while (start < end) {

            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        partition(str, 0, "");

        sc.close();
    }
}