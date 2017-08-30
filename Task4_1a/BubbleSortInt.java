/*  1. Implemente los métodos de ordenación de inserción, Shellsort y quicksort
    usando las implementaciones del teórico. Ejecútelos con los siguientes objetos:
    a) enteros.
    b) números reales de tipo double.
    c) cadena de caracteres. */

package Task4_1a;

import static java.lang.System.*;

public class BubbleSortInt {
    public static void main(String[] args) {
        int array[] = {84, 90, -38, 21, 98, 97, 26, 92, 56, -75, 54, 71, 82, 63, 58, 60, 18, 57, 12, 37, 20, 31, 99, 48, 66, -47, 23, 89, 74, 22, 13, 44, 27, 11, 1, 87, 82, 10, 79, 0, 32, -49, 69, 68, 81, 6, 61, 64};

        out.print("Non-Sorted List: ");
        for (int integer : array) {
            out.printf("%d ", integer);
        }

        bubbleSort(array);

        out.print("\nSorted List: ");
        for (int integer : array) {
            out.printf("%d ", integer);
        }
    }

    private static void bubbleSort(int array[]) {
        int n, temp;

        for (int i = 1; i < array.length; i++) {
            n = i;

            while (n > 0 && array[n - 1] > array[n]) {
                temp = array[n];
                array[n] = array[n - 1];
                array[n - 1] = temp;
                n--;
            }
        }
    }
}
