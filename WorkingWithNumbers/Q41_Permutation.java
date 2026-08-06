package WorkingWithNumbers;

import java.util.Scanner;

public class Q41_Permutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int fact1 = 1;
        int fact2 = 1;

        for (int i = n; i > 1; i--) {
            fact1 = fact1 * i;
        }

        int number = n - r;

        for (int i = number; i > 1; i--) {
            fact2 = fact2 * i;
        }

        int permutation = fact1 / fact2;

        System.out.println("Permutation = " + permutation);

        sc.close();
    }
}