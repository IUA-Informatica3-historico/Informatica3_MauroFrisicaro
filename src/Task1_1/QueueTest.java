package Task1_1;

import java.util.LinkedList;
import java.util.Random;

import static org.junit.Assert.*;

public class QueueTest {
    @org.junit.Test
    public void pushPop() throws Exception {

        Queue myQueue = new Queue(3);
        boolean status = myQueue.push("a");
        assertTrue(status);
        status = myQueue.push("b");
        assertTrue(status);
        status = myQueue.push("c");
        assertTrue(status);

        status = myQueue.push("d");
        assertFalse(status);

        assertEquals("a", myQueue.top());
        myQueue.pop();
        assertEquals("b", myQueue.top());
        myQueue.pop();
        assertEquals("c", myQueue.top());
        myQueue.pop();
    }

    @org.junit.Test
    public void pushCircular() throws Exception {
        Queue myQueue = new Queue(3);

        assertTrue(myQueue.push("a"));
        assertEquals("a", myQueue.top());

        assertTrue(myQueue.push("b"));
        assertEquals("a", myQueue.top());

        assertTrue(myQueue.push("c"));
        assertEquals("a", myQueue.top());

        myQueue.pop();
        assertTrue(myQueue.push("d"));
        assertEquals("b", myQueue.top());
        myQueue.pop();
        assertEquals("c", myQueue.top());
        myQueue.pop();
        assertEquals("d", myQueue.top());

        assertTrue(myQueue.push("e"));
        assertEquals("d", myQueue.top());
        assertTrue(myQueue.push("f"));
        assertEquals("d", myQueue.top());

        myQueue.pop();
        assertEquals("e", myQueue.top());

        myQueue.pop();
        assertEquals("f", myQueue.top());

        myQueue.pop();
    }

    @org.junit.Test
    public void randomised() throws Exception {
        final int N = 100000;
        final int MAX_SIZE = 42;

        Queue myQueue = new Queue(MAX_SIZE);
        java.util.Queue<String> javaQueue = new LinkedList<String>();

        int counter = 0;
        int size = 0;
        Random rand = new Random();

        for (int i = 0; i < N; ++i) {
            //System.out.println("Step " + Integer.toString(i));
            if (size < MAX_SIZE) {
                if (size == 0 || rand.nextInt(100) % 3 == 0) {
                    String elem = Integer.toString(counter++);
                    assertTrue(myQueue.push(elem));
                    javaQueue.add(elem);
                    ++size;
                }
            }
            if (size > 0) {
                if (!javaQueue.peek().equals(myQueue.top())) {
                    System.out.println(javaQueue.peek() + " != " + myQueue.top());
                }
                assertEquals(javaQueue.peek(), myQueue.top());
                if (rand.nextInt(100) % 3 == 0) {
                    myQueue.pop();
                    javaQueue.poll();
                    --size;
                }
                if (size > 0) {
                    if (!javaQueue.peek().equals(myQueue.top())) {
                        System.out.println(javaQueue.peek() + " != " + myQueue.top());
                    }
                    assertEquals(javaQueue.peek(), myQueue.top());
                }
            }
        }

        while (size > 0) {
            assertEquals(javaQueue.peek(), myQueue.top());
            myQueue.pop();
            javaQueue.poll();
            --size;
        }
    }
}