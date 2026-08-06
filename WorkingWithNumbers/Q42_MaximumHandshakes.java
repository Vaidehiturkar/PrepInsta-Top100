package WorkingWithNumbers;

import java.util.Scanner;

public class Q42_MaximumHandshakes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int num = sc.nextInt();

        int total = num * (num - 1) / 2;

        System.out.println("Maximum Handshakes = " + total);

        sc.close();
    }
}