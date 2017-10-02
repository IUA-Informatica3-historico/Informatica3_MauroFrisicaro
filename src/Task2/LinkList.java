// Mauro Frisicaro
// mfrsicaro220@alumnos.iua.edu.ar

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
     * Add a new element to the end of list
     *
     * @param element to be added
     */
    public void add(T element) {

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

    /*
    public T getAt(int index){
        // WIP

        return ;
    }
    */

    /**
     * Deletes a element of the list by index.
     *
     * @param index element to be deleted.
     */
    public void delete(int index) {
        // WIP
        Node temp = head;

        if (isEmpty()) {
            throw new RuntimeException("The list is empty.");
        } else if ((index < 0) || (index > getSize() - 1)) {
            throw new RuntimeException("The index is out of range.");
        }

        // x

        else if (index == 1) {
            head.setNext(head.getNext().getNext());
            return;
        } else if (index == getSize()) {
            for (int i = 0; i < getSize(); ++i) {
                if (i == i - 1) { // Always false :C
                    temp.setNext(temp.getNext());
                }
            }
        }

        for (int i = 0; i < getSize(); ++i) {
            if (i == index - 1) {
                temp.setNext(temp.getNext().getNext());
            }

            temp = temp.getNext();
        }
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