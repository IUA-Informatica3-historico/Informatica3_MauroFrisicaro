/*  Agregue el método insert Ordenado que permita realizar inserciones de
    datos pero mantener el orden dentro de la lista. */

package Task2_2;

import java.util.Scanner;
import Task2.LinkedList;
import Task2.Iteration;
import Task2.Node;

public class SortedInsert {
    public static void main(String[] args) {
        int max = 20, j = 1, m, x;
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        Iteration itr = new Iteration(list);

        System.out.print("Input of " + max + " numbers between 0 and 100.\n");

        for (int i = 0; i < max; i++) {
            m = 0;

            do {
                System.out.printf("Number [%d]: ", j);
                x = input.nextInt();


                if (x < 0 || x > 100) {
                    System.out.print("The Number is out of range.\n");
                }
                else {
                    if (i == 0) {
                        itr.insert(x);
                        m = 1;
                        j++;
                    } else {
                        Sorted(x, itr);
                        m = 1;
                        j++;
                    }
                }
            }
            while (m == 0);
        }

        System.out.print("\nSorted List: ");
        itr.print(list);
        System.out.print("Full: ");
    }

    public static void Sorted(int x, Iteration lt) {
        Node temp;

        lt.zero();

        while (lt.actual.next != null) {
            if (x < lt.actual.next.data) {
                temp = lt.actual.next;
                lt.insert(x);
                lt.actual.next = temp;
                return;
            }
            lt.goNext();
        }
        lt.insert(x);
    }
}
