package WorkingWithNumbers;

import java.util.Scanner;

public class Q29_HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        while (num2 != 0) {

            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        System.out.println("HCF = " + num1);

        sc.close();
    }
}