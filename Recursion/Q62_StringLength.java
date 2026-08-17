package Recursion;

import java.util.Scanner;

public class Q62_StringLength {

    static int length(String str, int index) {

        if (index == str.length())
            return 0;

        return 1 + length(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int result = length(str, 0);

        System.out.println("Length of " + str + " is " + result);

        sc.close();
    }
}