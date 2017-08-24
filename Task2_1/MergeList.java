/*  Crear una función concatenar que dada dos listas enlazadas, pasadas
    como parámetro, devuelva una lista enlazada que es la unión de las otras dos. */

package Task2_1;

import Task2.LinkedList;

import java.util.Scanner;

public class MergeList {
    public static void main(String[] args) {

        int size1, size2, counter, temp;
        Scanner input = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3;

        System.out.print("Number of elements in the First List: ");
        size1 = input.nextInt();
        System.out.print("Number of elements in the Second List: : ");
        size2 = input.nextInt();

        System.out.print("\nList 1\n");
        counter = 1;
        for (int i = 0; i < size1; i++) {
            System.out.printf("Element [%d]: ", counter);
            temp = input.nextInt();
            list1.insert(temp);
            counter++;
        }

        System.out.print("\nList 2\n");
        counter = 1;
        for (int i = 0; i < size2; i++) {
            System.out.printf("Element [%d]: ", counter);
            temp = input.nextInt();
            list2.insert(temp);
            counter++;
        }

        System.out.print("\nNew Merged List: ");
        list3 = concatenate(list1, list2);
        list3.print(list3);
    }

    public static LinkedList concatenate(LinkedList l1, LinkedList l2) {
        LinkedList l3 = new LinkedList();

        while (!l1.isNextNull()) {
            l3.insert(l1.getActualData());
            l3.goNext();
        }

        l2.zero();
        l2.goNext();

        while (!l2.isNextNull()) {
            l3.insert(l2.getActualData());
            l3.goNext();
        }

        return l3;
    }
}
