package Task2_3;

import Task2.LinkList;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class InvertedList {

    public static void main(String[] args) {
        int temp;
        AtomicInteger counter = new AtomicInteger(1);
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list = new LinkList<>();

        System.out.print("Length of List: ");
        int size = input.nextInt();

        for (int i = 0; i < size; ++i) {
            System.out.printf("Number [%d]: ", counter.get());
            temp = input.nextInt();
            list.insert(temp);
            counter.getAndIncrement();
        }

        System.out.print("\nInverted List: ");
        invert(list);
        System.out.println(list.toString());
    }

    private static void invert(LinkList<Integer> lt) {
        String text = lt.toString();
        StringBuilder x = new StringBuilder();

        x.append(text);
        text = (x).reverse().toString();
        x.setLength(0);

        lt.doEmpty();

        for (int i = 0; i < text.length(); ++i) {
            if ((text.charAt(i) == ('0')) || (text.charAt(i) == ('1')) ||
                    (text.charAt(i) == ('2')) || (text.charAt(i) == ('3')) ||
                    (text.charAt(i) == ('4')) || (text.charAt(i) == ('5')) ||
                    (text.charAt(i) == ('6')) || (text.charAt(i) == ('7')) ||
                    (text.charAt(i) == ('8')) || (text.charAt(i) == ('9'))) {
                x.append(text.charAt(i));
            } else if (text.charAt(i) == (' ')) {
                lt.insert(Integer.parseInt(x.toString()));
                x.setLength(0);
            } else {
                System.out.println("ERROR - Invalid String Input");
            }
        }
        lt.insert(Integer.parseInt(x.toString()));
    }
}
