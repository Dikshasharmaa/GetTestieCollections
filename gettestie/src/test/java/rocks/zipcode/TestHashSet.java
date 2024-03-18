package rocks.zipcode;

import org.junit.Test;

import java.util.Deque;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestHashSet1() {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Hi 1");
        assertEquals(true,set1.contains("Hi 1")); // false
    }
    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestHashSet2(){
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Hi 2");
        set2.remove("Hi 2");
        assertEquals(false,set2.contains("Hi 2"));

    }
    @Test
    public void TestHashSet3(){
        HashSet<String> set3 = new HashSet<String>();
        set3.add("Hi 3");
        set3.clear();
        assertEquals(false,set3.contains("Hi 3"));
    }
    @Test
    public void TestHashSet4(){
        HashSet<String> set5 = new HashSet<String>();
        set5.add("Hi 5");
        set5.add("Hi 6");
        assertEquals(2,set5.size());
    }
    }
