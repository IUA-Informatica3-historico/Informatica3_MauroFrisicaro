package Task2;

import java.util.EmptyStackException;

public class Iteration {
    public LinkedList list;
    public Node actual;

    public Iteration(LinkedList l) {
        list = l;
        actual = list.isEmpty() ? list.head : list.head.next;
    }

    public void insert(int x) {
        if (actual == null) {
            return;
        }

        Node newNode = new Node(x, actual.next);
        actual = actual.next = newNode;
    }

    public boolean search(int x) {
        Node itr = list.head.next;

        while (itr != null && (itr.data == x) == false) {
            itr = itr.next;
        }

        if (itr == null) {
            return false;
        }

        actual = itr;
        return true;
    }

    public void delete(int x) {
        Node itr = list.head;

        while (itr.next != null && (itr.next.data == x) == false) {
            itr = itr.next;
        }

        if (itr.next == null) {
            return;
        }

        itr.next = itr.next.next;
        actual = list.head;
    }

    public void print(LinkedList l) {
        if (l.isEmpty()) {
            throw new EmptyStackException();
        } else {
            Iteration itr = new Iteration(l);

            for (; itr.onList(); itr.goNext()) {
                System.out.print(itr.getActualData() + " ");
            }
        }

        System.out.println();
    }

    public boolean onList() {
        return actual != null && actual != list.head;
    }

    public int getActualData() {
        return onList() ? actual.data : null;
    }

    public void goNext() {
        if (actual != null) {
            actual = actual.next;
        }
    }

    public void zero() {
        actual = list.head;
    }
}