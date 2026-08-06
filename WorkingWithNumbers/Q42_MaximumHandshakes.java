package WorkingWithNumbers;

import java.util.Scanner;

public class Q42_MaximumHandshakes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int num = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= num; i++) {

            for (int j = i + 1; j <= num; j++) {
                total++;
            }
        }

        System.out.println("Maximum Handshakes = " + total);

        sc.close();
    }
}