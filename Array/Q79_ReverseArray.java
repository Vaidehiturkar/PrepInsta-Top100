package Array;

import java.util.Scanner;

public class Q79_ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] rev = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }

        System.out.println("Reverse array:");

        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }

        sc.close();
    }
}