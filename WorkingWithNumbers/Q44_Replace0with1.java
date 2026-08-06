package WorkingWithNumbers;

import java.util.Scanner;

public class Q44_Replace0with1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        String str = Integer.toString(number);
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '0')
                result = result + '1';
            else
                result = result + str.charAt(i);
        }

        System.out.println("Converted number: " + result);

        sc.close();
    }
}