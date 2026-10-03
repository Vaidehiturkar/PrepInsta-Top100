package String;

import java.util.Scanner;

public class Q90_RemoveVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (char ch : str.toCharArray()) {

            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("String without vowels = " + result);

        sc.close();
    }
}