package Basics;

import java.util.Scanner;

public class Q02_EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        sc.close();
    }
}