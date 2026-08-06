package WorkingWithNumbers;

import java.util.Scanner;

public class Q45_SumOfTwoPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 2; i <= num / 2; i++) {

            if (isPrime(i) && isPrime(num - i)) {

                System.out.println(num + " = " + i + " + " + (num - i));

                found = true;
            }
        }

        if (!found)
            System.out.println("Cannot be expressed as sum of two prime numbers");

        sc.close();
    }

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }
}