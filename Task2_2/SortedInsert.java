/*  Agregue el método insert Ordenado que permita realizar inserciones de
    datos pero mantener el orden dentro de la lista. */

package Task2_2;

import Task2.LinkedList;
import java.util.Scanner;

public class SortedInsert {
    public static void main(String[] args) {
        int max = 20, j = 1, m, x;
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Input of " + max + " numbers between 0 and 100.\n");

        for (int i = 0; i < max; i++) {
            m = 0;

            do {
                System.out.printf("Number [%d]: ", j);
                x = input.nextInt();

                if (x < 0 || x > 100) {
                    System.out.print("The Number is out of range.\n");
                } else {
                    if (i == 0) {
                        list.insert(x);
                        m = 1;
                        j++;
                    } else {
                        Sorted(x, list);
                        m = 1;
                        j++;
                    }
                }
            }
            while (m == 0);
        }

        System.out.print("\nSorted List: ");
        list.print(list);
        System.out.print("Full: ");
    }

    public static void Sorted(int x, LinkedList lt) {
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
