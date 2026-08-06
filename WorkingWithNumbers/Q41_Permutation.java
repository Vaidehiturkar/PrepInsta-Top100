package WorkingWithNumbers;

import java.util.Scanner;

public class Q41_Permutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int permutation = 1;

        for (int i = n; i > n - r; i--) {
            permutation = permutation * i;
        }

        System.out.println("Permutation = " + permutation);

        sc.close();
    }
}