package WorkingWithNumbers;

import java.util.Scanner;

public class Q53_QuadraticRoots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {

            System.out.println("No real roots");

        } else {

            double sqrt = Math.sqrt(d);

            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);

            if (d == 0) {
                System.out.println("One real root");
                System.out.println("Root = " + root1);
            } else {
                System.out.println("Two real roots");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            }
        }

        sc.close();
    }
}