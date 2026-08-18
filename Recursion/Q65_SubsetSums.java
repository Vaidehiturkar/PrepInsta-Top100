package Recursion;

import java.util.Scanner;

public class Q65_SubsetSums {

    static void findSums(int[] arr, int index, int sum) {

        if (index == arr.length) {
            System.out.print(sum + " ");
            return;
        }

        findSums(arr, index + 1, sum + arr[index]);

        findSums(arr, index + 1, sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sums of all subsets:");

        findSums(arr, 0, 0);

        sc.close();
    }
}