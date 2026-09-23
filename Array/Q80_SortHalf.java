package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Q80_SortHalf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int mid = n / 2;

        System.out.println("Required array:");

        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}