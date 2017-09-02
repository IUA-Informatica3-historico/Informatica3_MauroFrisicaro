/*  Escriba un método recursivo que devuelva el número de unos en la representación binaria de N.
    Use el hecho de que es igual al número de unos en la representación binaria de N/2, más 1 si N es impar. */

package Task3_6;

import java.util.Scanner;

public class BinaryCounter {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Write a Number: ");
            number = input.nextInt();
        }
        while (number < 0);

        System.out.println("\nThe amount of 1s on the number in binary is: " + bnCt(number));
        System.out.println("\nThe amount of 1s on the number in binary is: " + bnCtBW(number));
    }

    private static int bnCt(int n) {
        if (n < 2) {
//            System.out.print(n % 2);
            return n;
        } else {
//            System.out.print(n % 2);
            return bnCt(n / 2) + (n % 2);
        }
    }

    private static int bnCtBW(int n) {
        return n != 0
                ? (n & 0x1) + bnCtBW(n >> 1)
                : 0;
    }
}