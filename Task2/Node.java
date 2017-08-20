package Task2;

public class Node {
    public int data;
    public Node next;

    Node(int x) {
        this(x, null);
    }

    Node(int d, Node n) {
        data = d;
        next = n;
    }
}
