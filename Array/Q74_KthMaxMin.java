package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Q74_KthMaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Kth Minimum = " + arr[k - 1]);
        System.out.println("Kth Maximum = " + arr[n - k]);

        sc.close();
    }
}