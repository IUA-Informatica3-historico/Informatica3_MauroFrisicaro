/*  Implemente el metodo merge(list) que agrega los elementos de list a la list original. */

package Task2_4;

import Task2.LinkList;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MergeListOriginal {

    public static void main(String[] args) {
        int size1, size2, temp;
        AtomicInteger counter = new AtomicInteger();
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list1 = new LinkList<>();
        LinkList<Integer> list2 = new LinkList<>();

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
        merge(list1, list2);
        System.out.println(list1.toString());
    }

    public static void merge(LinkList l1, LinkList l2) {
        // WIP
        String text = l2.toString();

        for (int i = 0; i < text.length(); ++i) {


        }


        // WIP
    }
}