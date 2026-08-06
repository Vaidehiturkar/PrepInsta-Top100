package WorkingWithNumbers;

import java.util.Scanner;

public class Q44_Replace0with1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Converted number: 1");
            sc.close();
            return;
        }

        int result = 0;
        int place = 1;

        while (number > 0) {

            int rem = number % 10;

            if (rem == 0)
                rem = 1;

            result = result + rem * place;

            place = place * 10;

            number = number / 10;
        }

        System.out.println("Converted number: " + result);

        sc.close();
    }
}