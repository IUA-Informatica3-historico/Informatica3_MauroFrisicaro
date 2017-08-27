package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListTest {
    @Test
    public void isEmpty() throws Exception {

        LinkList<Integer> list = new LinkList<>();
        boolean status;

        status = list.isEmpty();
        assertTrue(status);
        list.add(3);
        status = list.isEmpty();
        assertFalse(status);
    }

    @Test
    public void add() throws Exception {
        LinkList<Integer> list = new LinkList<>();

        assertEquals("", list.toString());
        list.add(1);
        assertEquals("1", list.toString());
        list.add(2);
        assertEquals("1 2", list.toString());
        list.add(3);
        assertEquals("1 2 3", list.toString());
        list.add(-50);
        assertEquals("1 2 3 -50", list.toString());
    }

    @Test
    public void size() throws Exception {
        LinkList<Integer> list = new LinkList<>();

        assertEquals(0, list.getSize());
        list.add(43);
        assertEquals(1, list.getSize());
        list.add(22);
        assertEquals(2, list.getSize());
        list.add(302);
        assertEquals(3, list.getSize());
    }

    @Test
    public void delete() throws Exception {
        LinkList<Integer> list = new LinkList<>();

        // Deleting from the middle
        list.add(30);
        list.add(20);
        list.add(10);
        list.delete(2);
        assertEquals("30 10", list.toString());

        // Deleting the first node
        list.add(90);
        list.delete(1);
        assertEquals("10 90", list.toString());

        // Deleting the last node
        list.add(70);
        list.delete(3);
        assertEquals("10 90", list.toString());

        // Deleting all the elements
        list.delete(1);
        list.delete(2);
        assertEquals("10 90", list.toString());
        assertFalse(list.isEmpty());

        // Using wrong indexes
        list.add(100);
        list.add(200);
        list.add(400);
        list.delete(-1);
        list.delete(5);
    }
}