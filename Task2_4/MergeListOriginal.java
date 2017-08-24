/*  Implemente el metodo merge(list) que agrega los elementos de list a la list original. */

package Task2_4;

import Task2.LinkedList;
import java.util.Scanner;

public class MergeListOriginal {
    public static void main(String[] args) {
        int n, m, j, temp;
        Scanner input = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        System.out.print("Number of elements in the First List: ");
        n = input.nextInt();
        System.out.print("Number of elements in the Second List: ");
        m = input.nextInt();
        j = 1;

        System.out.println("\nList 1:\n");

        for (int i = 0; i < n; i++) {
            System.out.printf("Number [%d]: ", j);
            temp = input.nextInt();
            list1.insert(temp);
            j++;
        }

        System.out.println("\nList 2:\n");
        j = 1;

        for (int i = 0; i < m; i++) {
            System.out.printf("Number [%d]: ", j);
            temp = input.nextInt();
            list2.insert(temp);
            j++;
        }

//        LinkedList nuevalist = new LinkedList(union(list1, list2));
        System.out.print("\nList Unida: ");
//        nuevalist.print(nuevalist);
    }

    public static LinkedList union(LinkedList l1, LinkedList l2) {
        /*
        Node temp;
        LinkedListX listUnida = new LinkedListX();
        Iteration listUnidaItr = new Iteration(listUnida);
        l1.zero();
        l2.zero();
        listUnidaItr.insert(l1.actual.next.data);
        l1.goNext();
        listUnidaItr.zero();

        while (l1.actual.next != null) {
            if (listUnidaItr.actual.next != null) {
                if (l1.actual.next.data < listUnidaItr.actual.next.data) {
                    temp = listUnidaItr.actual.next;
                    listUnidaItr.insert(l1.actual.next.data);
                    listUnidaItr.actual.next = temp;
                    listUnidaItr.zero();
                    l1.goNext();
                } else {
                    listUnidaItr.goNext();
                }
            } else {
                listUnidaItr.insert(l1.actual.next.data);
                l1.goNext();
            }
        }

        listUnidaItr.zero();

        while (l2.actual.next != null) {
            if (listUnidaItr.actual.next != null) {
                if (l2.actual.next.data < listUnidaItr.actual.next.data) {
                    temp = listUnidaItr.actual.next;
                    listUnidaItr.insert(l2.actual.next.data);
                    listUnidaItr.actual.next = temp;
                    listUnidaItr.zero();
                    l2.goNext();
                } else {
                    listUnidaItr.goNext();
                }
            } else {
                listUnidaItr.insert(l2.actual.next.data);
                l2.goNext();
            }
        }

        return listUnida;
        */
        return l1;
    }
}