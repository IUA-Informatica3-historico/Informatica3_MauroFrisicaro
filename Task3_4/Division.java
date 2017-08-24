/*  Escriba un método recursivo que calcule el cociente de dos números enteros usando restas sucesivas. */

package Task3_4;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int dividend, divider;
        boolean flag = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Write the Dividend: ");
        dividend = input.nextInt();

        do {
            System.out.print("Write the Divider: ");
            divider = input.nextInt();

            if (divider == 0) {
                System.out.println("The Divider cant be zero.");
            } else {
                flag = false;
            }
        }
        while (flag);

        System.out.println();
        System.out.print(div(dividend, divider));
    }

    private static double div(int a, int b) {
        if (Math.abs(a) < Math.abs(b)) {
            System.out.printf("%d -> ", a);
            return 0;
        } else if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.printf("%d - ", a);
            return 1 + div(a - b, b);
        } else if (a > 0 && b < 0) {
            return -1 + div(a + b, b);
        } else if (a < 0 && b > 0) {
            return -1 - div(-a - b, -b);
        } else {
            throw new ArithmeticException("Cant divide by zero.");
        }
    }
}