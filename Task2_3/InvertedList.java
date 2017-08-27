/*  Implementar la función fnInvierte(lista).
    Esta función invertirá el orden original de los elementos en la lista, de tal forma que el último elemento
    será ahora el primero, el penúltimo será el segundo, y así hasta que el primero sea el último.
    Considere que la lista no está vacía y que no se construirá una nueva, sólo se invertirá el orden de los elementos
    de la lista original. */

package Task2_3;

import Task2.LinkList;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class InvertedList {

    private static int size;

    public static void main(String[] args) {
        int temp;
        AtomicInteger counter = new AtomicInteger(1);
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list = new LinkList<>();

        System.out.print("Length of List: ");
        size = input.nextInt();

        for (int i = 0; i < size; ++i) {
            System.out.printf("Number [%d]: ", counter.get());
            temp = input.nextInt();
            list.add(temp);
            counter.getAndIncrement();
        }

        System.out.print("\nInverted List: ");
        invert(list);
        System.out.println(list.toString());
    }

    public static void invert(LinkList lt) {

        // WIP
/*
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
*/
    }
}
