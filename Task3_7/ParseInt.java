/*  Escribir una función que introduzca un entero no negativo por teclado y lo imprima como una serie de dígitos separados por espacios.
    Ej: fn(2345) -> 2 3 4 5 */

package Task3_7;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Write a Number: ");
        number = input.nextInt();

        parse(number);
    }

    private static void parse(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        parse(n / 10);
        System.out.print(n % 10 + " ");
    }
}
