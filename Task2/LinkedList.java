package Task2;

public class LinkedList {
    public Node head;

    public LinkedList() {
        head = new Node(0);
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void doEmpty() {
        head.next = null;
    }
}
