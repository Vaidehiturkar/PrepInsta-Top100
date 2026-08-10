package WorkingWithNumbers;

import java.util.Scanner;

public class Q50_NumberToWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Zero");
            return;
        }

        if (num >= 1000) {
            System.out.print(num / 1000 + " Thousand ");
            num = num % 1000;
        }

        if (num >= 100) {
            System.out.print(num / 100 + " Hundred ");
            num = num % 100;
        }

        if (num >= 20) {
            System.out.print(num / 10 + " ");
            num = num % 10;
        }

        if (num > 0) {
            System.out.print(num);
        }

        sc.close();
    }
}