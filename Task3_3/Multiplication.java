/*  Escriba un método recursivo que calcule el producto de dos números enteros usando sumas sucesivas. */

package Task3_3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Write the First Number: ");
        number1 = input.nextInt();
        System.out.print("Write the Second Number: ");
        number2 = input.nextInt();

        System.out.println();
        System.out.printf("%d * %d = ", number1, number2);
        if (Math.abs(number1) < Math.abs(number2)) {
            System.out.print(mul(number2, number1));
        } else {
            System.out.print(mul(number1, number2));
        }
    }

    private static int mul(int a, int b) {
        if (b == 0) {
            System.out.print(" = ");
            return 0;
        } else if (b < 0) {
            System.out.printf(" -(%d * %d) = ", a, b);
            return mul(-a, -b);
        } else {
            System.out.printf("%d", a);
            if (b > 1) {
                System.out.print(" + ");
            }
            return a + mul(a, b - 1);
        }
    }
}
