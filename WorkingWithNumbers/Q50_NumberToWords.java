package WorkingWithNumbers;

import java.util.Scanner;

public class Q50_NumberToWords {

    static String[] ones = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Zero");
        } 
        else {
            System.out.println(convert(num));
        }

        sc.close();
    }

    static String convert(int num) {

        String result = "";

        if (num >= 1000) {
            result = result + ones[num / 1000] + " Thousand ";
            num = num % 1000;
        }

        if (num >= 100) {
            result = result + ones[num / 100] + " Hundred ";
            num = num % 100;
        }

        if (num >= 20) {
            result = result + tens[num / 10] + " ";
            num = num % 10;
        }

        if (num > 0) {
            result = result + ones[num];
        }

        return result;
    }
}