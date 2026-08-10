package WorkingWithNumbers;

public class Q48_PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) {

            boolean prime = true;

            for (int i = 2; i * i <= num; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(num + " ");
        }
    }
}