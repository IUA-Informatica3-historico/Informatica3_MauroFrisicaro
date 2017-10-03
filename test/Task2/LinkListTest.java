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
        list.insert(3);
        status = list.isEmpty();
        assertFalse(status);
    }

    @Test
    public void add() throws Exception {
        LinkList<Integer> list = new LinkList<>();

        assertEquals("", list.toString());
        list.insert(1);
        assertEquals("1", list.toString());
        list.insert(2);
        assertEquals("1 2", list.toString());
        list.insert(3);
        assertEquals("1 2 3", list.toString());
        list.insert(-50);
        assertEquals("1 2 3 -50", list.toString());
    }

    @Test
    public void size() throws Exception {
        LinkList<Integer> list = new LinkList<>();

        assertEquals(0, list.getSize());
        list.insert(43);
        assertEquals(1, list.getSize());
        list.insert(22);
        assertEquals(2, list.getSize());
        list.insert(302);
        assertEquals(3, list.getSize());
    }

    @Test
    public void delete() throws Exception {
        LinkList<Integer> list = new LinkList<>();

        // Deleting from the middle
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.delete(2);
        assertEquals("30 10", list.toString());

        // Deleting the first node
        list.insert(90);
        list.delete(1);
        assertEquals("10 90", list.toString());

        // Deleting the last node
        list.insert(70);
        list.delete(3);
        assertEquals("10 90", list.toString());

        // Deleting all the elements
        list.delete(1);
        list.delete(2);
        assertEquals("", list.toString());
        assertFalse(list.isEmpty());

        // Using wrong indexes
        list.insert(100);
        list.insert(200);
        list.insert(400);
        list.delete(-1);
        list.delete(5);
        assertEquals("100 200 400", list.toString());
    }
}