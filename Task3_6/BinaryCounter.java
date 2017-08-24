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

        System.out.println();
        System.out.println("\nThe amount of 1s on the number in binary is: " + bnCt(number));
    }

    static int bnCt(int n) {
        if (n < 2) {
            return n;
        } else {
            return bnCt(n / 2) + bnCt(n % 2);
        }

    }
}