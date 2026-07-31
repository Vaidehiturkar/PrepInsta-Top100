package WorkingWithNumbers;

import java.util.Scanner;

public class Q29_HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 1;

        int min;

        if (num1 < num2)
            min = num1;
        else
            min = num2;

        for (int i = 1; i <= min; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);

        sc.close();
    }
}