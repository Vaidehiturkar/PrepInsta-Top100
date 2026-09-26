package Array;

import java.util.Scanner;

public class Q83_LongestPalindrome {

    static boolean isPalindrome(int num) {

        String str = String.valueOf(num);

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return str.equals(reverse);
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

            if (isPalindrome(arr[i]) && arr[i] > longest) {
                longest = arr[i];
            }
        }

        if (longest == -1)
            System.out.println("No palindrome found");
        else
            System.out.println("Longest Palindrome = " + longest);

        sc.close();
    }
}