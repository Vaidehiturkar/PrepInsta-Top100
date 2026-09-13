package Array;

import java.util.Scanner;
import java.util.TreeSet;

public class Q74_KthMaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int min = set.first();
        int max = set.last();

        for (int i = 1; i < k; i++) {
            min = set.higher(min);
            max = set.lower(max);
        }

        System.out.println("Kth Minimum = " + min);
        System.out.println("Kth Maximum = " + max);

        sc.close();
    }
}