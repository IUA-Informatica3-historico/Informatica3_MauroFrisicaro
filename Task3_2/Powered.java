/*  Escribir un método power (base, exponente) que, al llamarla, devuelva baseexponente.
    Por ejemplo, power ( 3,2 ) = 32=3*(31)=3*(3*30)=3*(3*1)=3*3=9.
    Suponga que exponente es un entero mayor o igual que 1. */

package Task3_2;

import java.util.Scanner;

public class Powered {
    public static void main(String[] args) {
        int base, exponent, number = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Base of the Power: ");
        base = input.nextInt();

        do {
            System.out.print("Exponent of the Power: ");
            exponent = input.nextInt();

            if (exponent <= 1) {
                System.out.println("\nThe Exponent should be greater or equal to 1.\n");
            } else {
                number = 1;
            }
        }
        while (number == 0);

        System.out.println();
        System.out.print(power(base, exponent));
    }

    public static long power(int x, int y) {
        if (y == 1) {
            System.out.printf("%d = ", x);
            return x;
        }

        System.out.printf("%d * ", x);
        return x * power(x, y - 1);
    }
}