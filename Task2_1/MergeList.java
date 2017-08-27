/*  Crear una función concatenar que dada dos listas enlazadas, pasadas
    como parámetro, devuelva una lista enlazada que es la unión de las otras dos. */

package Task2_1;

import Task2.LinkList;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MergeList {

    public static void main(String[] args) {
        int size1, size2, temp;
        AtomicInteger counter = new AtomicInteger();
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list1 = new LinkList<>();
        LinkList<Integer> list2 = new LinkList<>();
        LinkList list3;

        System.out.print("Number of elements in the First List: ");
        size1 = input.nextInt();
        System.out.print("Number of elements in the Second List: : ");
        size2 = input.nextInt();

        System.out.print("\nList 1\n");
        counter.set(1);
        for (int i = 0; i < size1; ++i) {
            System.out.printf("Element [%d]: ", counter.get());
            temp = input.nextInt();
            list1.add(temp);
            counter.getAndIncrement();
        }

        System.out.print("\nList 2\n");
        counter.set(1);
        for (int i = 0; i < size2; ++i) {
            System.out.printf("Element [%d]: ", counter.get());
            temp = input.nextInt();
            list2.add(temp);
            counter.getAndIncrement();
        }

        System.out.print("\nNew Merged List: ");
        list3 = concatenate(list1, list2);
        System.out.println(list3.toString());
    }

    private static LinkList concatenate(LinkList l1, LinkList l2) {
        // WIP
        LinkList l3 = new LinkList();
        String text = l1.toString() + " " + l2.toString();

        for (int i = 0; i < text.length(); ++i) {
/*
            if(text.charAt(i).equals(" ")){

            }else if(){

            }else if(){

            }else{

            }
*/


        }

        System.out.println(text);

        // WIP
        return l3;
    }
}
