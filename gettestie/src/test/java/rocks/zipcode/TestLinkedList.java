package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestLinkedList() {
        LinkedList<String> set1 = new LinkedList<String>();
        set1.add("Bob");
        assertEquals(true, set1.contains("Bob"));

    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestLinkedList1() {
        LinkedList<String> set2 = new LinkedList<String>();
        set2.add("Tom");
        set2.add("Bob");
        set2.remove("Tom");
        assertEquals(false, set2.contains("Tom"));


    }

    @Test
    public void TestLinkedList2() {
        LinkedList<String> set3 = new LinkedList<String>();
        set3.add("Frank");
        set3.clear();
        assertEquals(false, set3.contains("Frank"));
    }

    @Test
    public void TestLinkedList3() {
        LinkedList<String> set4 = new LinkedList<String>();
        set4.add("Rose");
        set4.addFirst("Joy");
        assertEquals(2, set4.size());
    }

    @Test
    public void TestLinkedList4() {
        LinkedList<String> set6 = new LinkedList<String>();
        set6.add("Rose");
        set6.set(0,"Happy");
        assertEquals("Happy",set6.get(0));
    }
    @Test
    public void TestLinkedList5() {
        LinkedList<String> set7 = new LinkedList<String>();
        set7.add("Tom");
        set7.add("Bob");
        set7.removeLast();
        assertEquals(false, set7.contains("Bob"));

    }
}
