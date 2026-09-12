package Recursion;

import java.util.Scanner;

public class Q72_AllSubsets {

    static void findSubsets(int[] arr, int index, String result) {

        if (index == arr.length) {
            System.out.println("{ " + result + "}");
            return;
        }

        findSubsets(arr, index + 1, result + arr[index] + " ");
        findSubsets(arr, index + 1, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findSubsets(arr, 0, "");

        sc.close();
    }
}