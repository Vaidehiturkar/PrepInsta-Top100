package WorkingWithNumbers;

import java.util.Scanner;
import java.time.YearMonth;

public class Q51_DaysInMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days = YearMonth.of(year, month).lengthOfMonth();

        System.out.println("Number of days: " + days);

        sc.close();
    }
}