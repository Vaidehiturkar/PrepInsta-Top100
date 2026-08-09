package WorkingWithNumbers;

import java.util.Scanner;

public class Q46_CountDecoding {

    static int countWays(String str, int index) {

        if (index == str.length())
            return 1;

        if (str.charAt(index) == '0')
            return 0;

        int count = countWays(str, index + 1);

        if (index + 1 < str.length()) {

            int num = Integer.parseInt(str.substring(index, index + 2));

            if (num >= 10 && num <= 26) {
                count = count + countWays(str, index + 2);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit sequence: ");
        String str = sc.next();

        int result = countWays(str, 0);

        System.out.println("Number of possible decodings: " + result);

        sc.close();
    }
}