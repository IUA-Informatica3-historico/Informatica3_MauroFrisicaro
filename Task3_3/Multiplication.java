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
        System.out.print(mul(number1, number2));
    }

    private static double mul(int a, int b) {
        if (b == 1) {
            System.out.printf("%d = ", a);
            return a;
        } else if (b < 0) {
            return -a - mul(-a, b + 1);
        } else {
            System.out.printf("%d + ", a);
            return a + mul(a, b - 1);
        }
    }
}
