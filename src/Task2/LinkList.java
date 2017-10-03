package Task2;

public class LinkList<T> {

    private Node<T> head;
    private int size;

    /**
     * Creates empty list.
     */
    public LinkList() {
        size = 0;
    }

    /**
     * @return true if the list is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Makes the list being empty.
     */
    public void doEmpty() {
        head = null;
        size = 0;
    }

    /**
     * Add a new element to the end of list
     *
     * @param element to be added
     */
    public void insert(T element) {

        Node<T> newNode = new Node<>(element, null);
        if (head == null) {
            head = newNode;
            size = 1;
            return; // Added first node.
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        size++;
        last.setNext(newNode);
    }

    /**
     * Return the elements on the linked list as a string.
     */

    @Override
    public String toString() {

        if (isEmpty()) {
            return "";
        }

        StringBuilder text = new StringBuilder();

        text.append(head.getData());

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
            text.append(" ").append(last.getData());
        }

        return text.toString();
    }

    /**
     * @return the size of the list.
     */
    public int getSize() {
        return size;
    }

    /**
     * Deletes a element of the list by index.
     *
     * @param index element to be deleted.
     */
    public void delete(int index) throws Exception {
        Node aux = head;
        int count = 0;

        if (index == 0) {
            head = head.getNext();
        }

        if (size <= index) {
            throw new Exception("The size is " + size);
        }

        while (count < (index - 1) && aux != null) {
            count++;
            aux = aux.getNext();
        }

        aux.setNext(aux.getNext().getNext());
    }

    // Task 2.2
    public void sortedInsert(T element) {
        Node<T> newNode = new Node<>(element, null);

        if (head == null) {
            size = 1;
            head = newNode;
            return;
        }

        // WIP WIP WIP
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        size++;
        last.setNext(newNode);
        // WIP WIP WIP
    }

    private static class Node<U> {
        private U data;
        private Node next;

        private Node(U data, Node node) {
            this.data = data;
            this.next = node;
        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }

        private U getData() {
            return data;
        }
    }
}