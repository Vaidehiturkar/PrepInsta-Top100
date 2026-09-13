package Array;

import java.util.Scanner;

public class Q73_LargestElement {

    static int largest(int[] arr, int n) {

        if (n == 1)
            return arr[0];

        int max = largest(arr, n - 1);

        if (arr[n - 1] > max)
            return arr[n - 1];
        else
            return max;
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

        System.out.println("Largest = " + largest(arr, n));

        sc.close();
    }
}