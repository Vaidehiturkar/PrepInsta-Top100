package WorkingWithNumbers;

import java.util.Scanner;

public class Q45_SumOfTwoPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 2; i <= num / 2; i++) {

            boolean prime1 = true;
            boolean prime2 = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime1 = false;
                    break;
                }
            }

            int second = num - i;

            for (int j = 2; j < second; j++) {
                if (second % j == 0) {
                    prime2 = false;
                    break;
                }
            }

            if (prime1 && prime2) {
                System.out.println(num + " = " + i + " + " + second);
                found = true;
            }
        }

        if (!found)
            System.out.println("Cannot be expressed as sum of two prime numbers");

        sc.close();
    }
}