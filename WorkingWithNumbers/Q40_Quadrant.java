package WorkingWithNumbers;

import java.util.Scanner;

public class Q40_Quadrant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println("Quadrant I");

        else if (x < 0 && y > 0)
            System.out.println("Quadrant II");

        else if (x < 0 && y < 0)
            System.out.println("Quadrant III");

        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");

        else if (x == 0 && y == 0)
            System.out.println("Origin");

        else if (x == 0)
            System.out.println("Y-Axis");

        else
            System.out.println("X-Axis");

        sc.close();
    }
}