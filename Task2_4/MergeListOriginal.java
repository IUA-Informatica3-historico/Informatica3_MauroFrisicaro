/*  Implemente el metodo merge(list) que agrega los elementos de list a la list original. */

package Task2_4;

import java.util.Scanner;

public class MergeListOriginal {
/*
    public static void main(String[] args) {
        int n, m, j, temp;
        Scanner entrada = new Scanner(System.in);
        LinkedListX list1 = new LinkedListX();
        LinkedListX list2 = new LinkedListX();
        Iteration itr1 = new Iteration(list1);
        Iteration itr2 = new Iteration(list2);

        System.out.print("Number of elements in the First List: ");
        n = entrada.nextInt();
        System.out.print("Number of elements in the Second List: ");
        m = entrada.nextInt();
        j = 1;

        System.out.println("\nList 1:\n");

        for (int i = 0; i < n; i++) {
            System.out.printf("Number [%d]: ", j);
            temp = entrada.nextInt();
            itr1.insert(temp);
            j++;
        }

        System.out.println("\nList 2:\n");
        j = 1;

        for (int i = 0; i < m; i++) {
            System.out.printf("N�mero [%d]: ", j);
            temp = entrada.nextInt();
            itr2.insert(temp);
            j++;
        }

        Iteration nuevalist = new Iteration(union(itr1, itr2));
        System.out.print("\nList Unida: ");
        nuevalist.print(nuevalist.list);
    }

    public static LinkedListX union(Iteration l1, Iteration l2) {
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
    }
*/
}