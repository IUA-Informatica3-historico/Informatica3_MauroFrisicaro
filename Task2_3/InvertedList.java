/*  Implementar la función fnInvierte(lista).
    Esta función invertirá el orden original de los elementos en la lista, de tal forma que el último elemento
    será ahora el primero, el penúltimo será el segundo, y así hasta que el primero sea el último.
    Considere que la lista no está vacía y que no se construirá una nueva, sólo se invertirá el orden de los elementos
    de la lista original. */

package Task2_3;

import Task2.LinkedList;

import java.util.Scanner;

public class InvertedList {
    public static int size;

    public static void main(String[] args) {
        int a = 1, temp;
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Number of elements in the List: ");
        size = input.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.printf("Number [%d]: ", a);
            temp = input.nextInt();
            list.insert(temp);
            a++;
        }

        System.out.print("\nInverted List: ");
        list.print(invert(list));
    }

    public static LinkedList invert(LinkedList lt) {

        int arr[] = new int[size];
        int a = 1;

        int i = 0, j = size - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            ++i;
            --j;
        }

        return lt;
    }
}
