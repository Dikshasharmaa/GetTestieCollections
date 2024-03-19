package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestLinkedList() {
        ArrayDeque<String> set1 = new ArrayDeque<String>();
        set1.addFirst("Bob");
        assertEquals(true, set1.contains("Bob"));

    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestLinkedList1() {
        ArrayDeque<String> set2 = new ArrayDeque<String>();
        set2.addFirst("Tom");
        set2.addLast("Bob");
        assertEquals("Tom", set2.getFirst());
        assertEquals("Bob",set2.getLast());


    }

    @Test
    public void TestLinkedList2() {
        ArrayDeque<String> set3 = new ArrayDeque<String>();
        set3.add("Frank");
        set3.element();
        assertEquals(true, set3.contains("Frank"));
    }

    @Test
    public void TestLinkedList3() {
        ArrayDeque<String> set4 = new ArrayDeque<String>();
        set4.add("Rose");
        set4.addFirst("Joy");
        assertEquals(2, set4.size());
    }
    @Test
    public void TestLinkedList4() {
        ArrayDeque<String> set5 = new ArrayDeque<String>();
        set5.add("Rose");
        set5.add("Joy");
        set5.removeLastOccurrence("Rose");
        assertEquals(false, set5.isEmpty());
    }

}
