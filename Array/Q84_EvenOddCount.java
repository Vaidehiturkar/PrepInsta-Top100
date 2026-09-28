package Array;

import java.util.Scanner;

public class Q84_EvenOddCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int even = 0;
        int odd = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even elements = " + even);
        System.out.println("Odd elements = " + odd);

        sc.close();
    }
}