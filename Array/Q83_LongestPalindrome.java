package Array;

import java.util.Scanner;

public class Q83_LongestPalindrome {

    static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int longest = -1;

        for (int i = 0; i < n; i++) {

            if (isPalindrome(arr[i])) {

                if (arr[i] > longest) {
                    longest = arr[i];
                }
            }
        }

        if (longest == -1)
            System.out.println("No palindrome found");
        else
            System.out.println("Longest Palindrome = " + longest);

        sc.close();
    }
}