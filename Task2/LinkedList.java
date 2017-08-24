package Task2;

import java.util.EmptyStackException;

public class LinkedList<T> {
    private Node<T> head;
    private Node actual;

    public LinkedList() {
        head = new Node(null, null);
        actual = isEmpty() ? head : head.next;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void doEmpty() {
        head.next = null;
    }

    public void insert(T data) {
        if (actual == null) {
            return;
        }

        Node newNode = new Node(data, actual.next);
        actual = actual.next = newNode;
    }

    public void print(LinkedList lt) {
        if (lt.isEmpty()) {
            throw new EmptyStackException();
        } else {
            for (; onList(); goNext()) {
                System.out.print(getActualData() + " ");
            }
        }

        System.out.println();
    }

    public boolean onList() {
        return actual != null && actual != head;
    }

    public void goNext() {
        if (actual != null) {
            actual = actual.next;
        }
    }

    public boolean isNextNull() {
        return actual.next == null ? true : false;
    }

    public Object getActualData() {
        return onList() ? actual.data : null;
    }

    public void zero() {
        actual = head;
    }

    /*
    public boolean search(int x) {
        Node itr = head.next;

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
        Node itr = head;

        while (itr.next != null && (itr.next.data == x) == false) {
            itr = itr.next;
        }

        if (itr.next == null) {
            return;
        }

        itr.next = itr.next.next;
        actual = head;
    }
*/
    private static class Node<U> {
        private U data;
        private Node next;

        public Node(U data, Node node) {
            this.data = data;
            this.next = node;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public U getData() {
            return data;
        }
    }
}