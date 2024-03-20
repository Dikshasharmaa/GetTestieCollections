package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestTreeSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestTreeSet1() {
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Hi 1");
        assertEquals(true,set1.contains("Hi 1")); // false
    }
    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestTreeSet2(){
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Hi 2");
        set2.remove("Hi 2");
        assertEquals(false,set2.contains("Hi 2"));

    }
    @Test
    public void TestTreeSet3(){
        TreeSet<String> set3 = new TreeSet<String>();
        set3.add("Hi 3");
        set3.clear();
        assertEquals(false,set3.contains("Hi 3"));
    }
    @Test
    public void TestTreeSet4(){
        TreeSet<String> set4 = new TreeSet<String>();
        set4.add("Hi 5");
        set4.add("Hi 6");
        assertEquals(2,set4.size());
    }
    }
