package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Q63_StringPermutations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        do {
            System.out.print(new String(arr) + " ");

        } while (nextPermutation(arr));

        sc.close();
    }

    static boolean nextPermutation(char[] arr) {

        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i < 0)
            return false;

        int j = arr.length - 1;

        while (arr[j] <= arr[i])
            j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {

            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return true;
    }
}