package Recursion;

import java.util.Scanner;

public class Q63_StringPermutations {

    static void permute(char[] str, int start, int end) {

        if (start == end) {
            System.out.print(new String(str) + " ");
            return;
        }

        for (int i = start; i <= end; i++) {

            char temp = str[start];
            str[start] = str[i];
            str[i] = temp;

            permute(str, start + 1, end);

            temp = str[start];
            str[start] = str[i];
            str[i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] arr = str.toCharArray();

        permute(arr, 0, arr.length - 1);

        sc.close();
    }
}