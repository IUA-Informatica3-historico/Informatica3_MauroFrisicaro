/*  (Visualización de la recursión ) Es interesante ver “en acción” a la recursión.
    Modifique el método factrn ( factorial ) para que imprima su variable local y el parámetro de llamada de la recursión.
    Por cada llamada recursiva, presente su salida en una línea independiente y agregue un nivel de sangría.
    Haga su mejor esfuerzo por hacer que la salida sea clara, interesante y significativa.
    Su meta aquí es diseñar e implementar un formato de salida que ayude a la gente a entender mejor la recursión.
    Tal vez desee agregar estas capacidades de presentación a los otros ejercicios del práctico. */

package Task3_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Write a number: ");
        number = input.nextInt();

        factNum(number);
    }

    private static long factNum(int n) {
        System.out.println();

        if (n == 1) {
            System.out.print(n + "\n");
            return 1;
        }

        for (int i = 0; i < (n - 1); i++) {
            System.out.print("\t");
        }

        System.out.println(n);

        long result = factNum(n - 1) * n;

        for (int i = 0; i < (n - 1); i++) {
            System.out.print("\t");
        }

        System.out.println(result);
        return result;
    }
}