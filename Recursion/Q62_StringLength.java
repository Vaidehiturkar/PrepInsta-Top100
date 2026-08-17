package Recursion;

import java.util.Scanner;

public class Q62_StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println("Length of " + str + " is " + count);

        sc.close();
    }
}