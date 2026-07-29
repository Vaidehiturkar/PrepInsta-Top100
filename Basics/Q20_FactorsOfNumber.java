package Basics;

import java.util.Scanner;

public class Q20_FactorsOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Factors are: ");

        for (int i = 1; i * i <= num; i++) {

            if (num % i == 0) {

                System.out.print(i + " ");

                if (i != num / i && num / i != num) {
                    System.out.print((num / i) + " ");
                }
            }
        }

        sc.close();
    }
}