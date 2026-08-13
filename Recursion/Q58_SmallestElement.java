package Recursion;

import java.util.Scanner;

public class Q58_SmallestElement {

    static int findSmallest(int[] arr, int index) {

        if (index == arr.length - 1)
            return arr[index];

        int smallest = findSmallest(arr, index + 1);

        if (arr[index] < smallest)
            return arr[index];
        else
            return smallest;
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

        int smallest = findSmallest(arr, 0);

        System.out.println("Smallest Element is : " + smallest);

        sc.close();
    }
}