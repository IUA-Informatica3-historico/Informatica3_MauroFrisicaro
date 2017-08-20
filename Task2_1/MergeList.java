/*  Crear una función concatenar que dada dos listas enlazadas, pasadas
    como parámetro, devuelva una lista enlazada que es la unión de las otras dos. */

package Task2_1;

import Task2.LinkedList;
import Task2.Iteration;

import java.util.Scanner;

public class MergeList {
    public static void main(String[] args) {
        int a, b, c, temp;
        Scanner input = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        Iteration itr1 = new Iteration(list1);
        Iteration itr2 = new Iteration(list2);

        System.out.print("Number of elements in the First List: ");
        a = input.nextInt();
        System.out.print("Number of elements in the Second List: : ");
        b = input.nextInt();

        System.out.print("\nList 1\n");
        c = 1;
        for (int i = 0; i < a; i++) {
            System.out.printf("Element [%d]: ", c);
            temp = input.nextInt();
            itr1.insert(temp);
            c++;
        }

        System.out.print("\nList 2\n");
        c = 1;
        for (int i = 0; i < b; i++) {
            System.out.printf("Element [%d]: ", c);
            temp = input.nextInt();
            itr2.insert(temp);
            c++;
        }

        System.out.print("\nNew Merged List: ");
        concatene(itr1, itr2);
        itr1.print(list1);
    }

    public static void concatene(Iteration l1, Iteration l2) {
        while (l1.actual.next != null) {
            l1.goNext();
        }

        l2.zero();
        l2.goNext();

        while (l2.actual != null) {
            l1.insert(l2.actual.data);
            l2.goNext();
        }
    }
}
