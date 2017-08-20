package Task1_1;

public class Queue { // First In First Out
    private String dates[];
    private int max;
    private int size;
    private int head;
    private int tail;

    Queue() {
        max = 100;
        dates = new String[max];
        size = 0;
        head = 0;
        tail = -1;
    }

    Queue(int num) {
        max = num;
        dates = new String[max];
        size = 0;
        head = 0;
        tail = -1;
    }

    public boolean push(String txt) {
        if (fullLogCheck()) {
            return false;
        }

        tail = increment(tail);
        dates[tail] = txt;
        size++;
        return true;
    }

    public void pop() {
        head = increment(head);
        size--;
    }

    public String top() {
        return dates[head];
    }

    public String popAndTop() {
        head = increment(head);
        size--;
        return dates[head];
    }

    private int increment(int num) {
        if (++num == dates.length) {
            num = 0;
        }

        return num;
    }

    public boolean emptyLogCheck() {
        return size == 0;
    }

    public boolean fullLogCheck() {
        return size == dates.length;
    }

    public void emptyLog() {
        size = 0;
        head = 0;
        tail = -1;
    }

    public void showLog() {
        int j = 0, k = 1;
        System.out.println();

        for (int i = head; j < size; i = increment(i)) {
            System.out.printf("(%d) %s\n", k, dates[i]);
            j++;
            k++;
        }
        System.out.println();
    }
}
