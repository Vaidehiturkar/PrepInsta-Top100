package String;

import java.util.Scanner;

public class Q88_StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int count = 0;

        for (char ch : arr) {
            count++;
        }

        System.out.println("Length = " + count);

        sc.close();
    }
}