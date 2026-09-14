package Array;

import java.util.Scanner;

public class Q75_SmallestElement {

    static int smallest(int[] arr, int n) {

        if (n == 1)
            return arr[0];

        int min = smallest(arr, n - 1);

        if (arr[n - 1] < min)
            min = arr[n - 1];

        return min;
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

        int min = smallest(arr, n);

        System.out.println("Smallest = " + min);

        sc.close();
    }
}