package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestQueue1() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(10);
        queue.add(20);
        assertEquals(true, queue.contains(10)); // false
    }

    @Test
    public void TestQueue2() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(30);
        queue.add(10);
        queue.add(50);

        assertEquals(10, queue.toArray()[0]); // false
    }
    @Test
    public void TestQueue3() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(30);
        queue.add(10);
        queue.remove(10);

        assertEquals(false, queue.contains(10)); // false
    }


}
