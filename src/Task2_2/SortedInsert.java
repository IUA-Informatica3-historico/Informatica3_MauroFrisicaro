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
        System.out.println();

        for (int i = 0; i < size; ++i) {
            System.out.printf("Number [%d]: ", counter.get());
            temp = input.nextInt();
            list.sortedInsert(temp);
            counter.getAndIncrement();

            System.out.print("Sorted List: " + list.toString() + "\n\n");
        }
    }
}
