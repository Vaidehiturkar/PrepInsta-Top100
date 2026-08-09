package WorkingWithNumbers;

import java.util.Scanner;

public class Q46_CountDecoding {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit sequence: ");
        String str = sc.next();

        int n = str.length();

        if (str.charAt(0) == '0') {
            System.out.println("Number of possible decodings: 0");
            sc.close();
            return;
        }

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            int oneDigit = str.charAt(i - 1) - '0';

            int twoDigit = Integer.parseInt(str.substring(i - 2, i));

            if (oneDigit >= 1)
                dp[i] = dp[i] + dp[i - 1];

            if (twoDigit >= 10 && twoDigit <= 26)
                dp[i] = dp[i] + dp[i - 2];
        }

        System.out.println("Number of possible decodings: " + dp[n]);

        sc.close();
    }
}