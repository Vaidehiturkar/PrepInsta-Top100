package Recursion;

import java.util.Scanner;

public class Q57_LargestElement {

    static int findLargest(int[] arr, int index) {

        if (index == arr.length - 1)
            return arr[index];

        int largest = findLargest(arr, index + 1);

        if (arr[index] > largest)
            return arr[index];
        else
            return largest;
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

        int largest = findLargest(arr, 0);

        System.out.println("Largest Element is " + largest);

        sc.close();
    }
}