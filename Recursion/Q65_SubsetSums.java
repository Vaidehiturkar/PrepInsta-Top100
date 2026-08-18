package Recursion;

import java.util.Scanner;

public class Q65_SubsetSums {

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

        int total = 1 << n;

        for (int i = 0; i < total; i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {

                if ((i & (1 << j)) != 0) {
                    sum = sum + arr[j];
                }
            }

            System.out.print(sum + " ");
        }

        sc.close();
    }
}