package String;

import java.util.Scanner;

public class Q86_AlphabetOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an Alphabet");
        }

        sc.close();
    }
}