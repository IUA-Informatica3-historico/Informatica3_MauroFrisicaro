/*  Agregue el método insert Ordenado que permita realizar inserciones de
    datos pero mantener el orden dentro de la lista. */

package Task2_2;

import Task2.LinkList;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SortedInsert {
    public static void main(String[] args) {

        int size, temp;
        AtomicInteger counter = new AtomicInteger(1);
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list = new LinkList<>();

        System.out.print("Length of List: ");
        size = input.nextInt();

        for (int i = 0; i < size; ++i) {
            System.out.printf("Number [%d]: ", counter.get());
            temp = input.nextInt();

            sort(list, temp);
            counter.getAndIncrement();

            System.out.println("\nSorted List: " + list.toString());
        }

        /*
        int max = 10, m, x;
        AtomicInteger counter = new AtomicInteger(1);
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list = new LinkList<>();

        System.out.print("Input of " + max + " numbers between 0 and 100.\n");

        for (int i = 0; i < max; ++i) {
            m = 0;

            do {
                System.out.printf("Number [%d]: ", counter.get());
                x = input.nextInt();

                if (x < 0 || x > 100) {
                    System.out.print("The Number is out of range.\n");
                } else {
                    if (i == 0) {
                        list.add(x);
                        m = 1;
                        counter.getAndIncrement();
                    } else {
                        Sorted(list, x);
                        m = 1;
                        counter.getAndIncrement();
                    }
                }
            }
            while (m == 0);
        }

        System.out.print("\nSorted List: ");
        sort(list, x);
        System.out.print(list.toString());
        */
    }

    private static void sort(LinkList lt, int x) {
// WIP
        /*
        Object temp;
        lt.zero();

        while (!lt.isNextNull()) {
            if (x < lt.isNextNull().data) {
                temp = lt.goNext();
                lt.insert(x);
                lt.goNext() = temp;
                return;
            }
            lt.goNext();
        }
        lt.insert(x);
        */
    }
}
